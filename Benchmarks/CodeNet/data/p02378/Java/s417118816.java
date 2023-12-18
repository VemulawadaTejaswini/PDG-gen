
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Solver{
	Scanner sc =new Scanner(System.in);

	int x;
	int y;
	int e;	
	
	void run(){
		x = sc.nextInt();
		y = sc.nextInt();
		e = sc.nextInt();
		
		int n = e+x+y;
		E[] edges = new E[n*2];
		
		for(int i =0 ; i < x ; i++){
			edges[i] = new E();
			edges[i].from = x+y;
			edges[i].to = i;
			edges[i].cap = 1;
			
			edges[n+i] = new E();
			edges[n+i].from = i;
			edges[n+i].to = x+y;
			edges[n+i].cap = 0;
			
			edges[i].rev = edges[n+i];
			edges[n+i].rev = edges[i];
		}
		
		for(int j = 0 ; j < y; j++){
			edges[x+j] = new E();
			edges[x+j].from = x+j;
			edges[x+j].to = x+y+1;
			edges[x+j].cap = 1;
			
			edges[n+x+j] = new E();
			edges[n+x+j].from  =x+y+1;
			edges[n+x+j].to = x+j;
			edges[n+x+j].cap = 0;
			
			edges[x+j].rev = edges[n+x+j];
			edges[n+x+j].rev = edges[x+j];
		}
		
		for(int k = 0 ; k < e; k++){
			int from = sc.nextInt();
			int to = sc.nextInt()+x;
			
			edges[x+y+k] = new E();
			edges[x+y+k].from = from;
			edges[x+y+k].to = to;
			edges[x+y+k].cap = 1;
			
			edges[n+x+y+k] = new E();
			edges[n+x+y+k].from = to;
			edges[n+x+y+k].to = from;
			edges[n+x+y+k].cap = 0;
			
			edges[x+y+k].rev = edges[n+x+y+k];
			edges[n+x+y+k].rev = edges[x+y+k];
		}
		
		depth = new int[x+y+2];
		Map<Integer,List<E>> map = new HashMap<Integer,List<E>>();
		for(E e: edges){
			map.computeIfAbsent(e.from,__ -> new ArrayList<E>()).add(e);
		}
		for(int i =0 ;i < x+y+2;i++){
//			System.out.println(i);
			for(E e :map.getOrDefault(i, Collections.emptyList())){
//				System.out.println(e.from +" "+e.to+" "+e.cap); 
			}
			
		}
		
		int sum = 0;
		for(;;){
			Arrays.fill(depth,-1);

			bfs(x+y+1,x+y,map);
//			System.out.println(Arrays.toString(depth));
			if(depth[x+y] == -1){
				break;
			}
			
			sum += max_flow(x+y,x+y+1,map);
			
		}
		System.out.println(sum);
		
	}
		
	int depth[];
	
	void bfs(int from, int to, Map<Integer,List<E>> map){
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		LinkedList<Integer> depthes = new LinkedList<Integer>();
		queue.add(from);
		depthes.add(0);
		
		for(;!queue.isEmpty();){
			
			int pos = queue.removeFirst();
			int d = depthes.removeFirst();
			
			if(depth[pos] != -1){
				continue;
			}
			
			depth[pos] = d;
			
			if(pos == to){
				break;
			}
			
			for(E e : map.getOrDefault(pos,Collections.emptyList())){
				
				if( e.rev.cap > 0 ){
					queue.addLast(  e.to );
					depthes.addLast( d + 1);
				}
			}
		}
	}
	
	int max_flow(int from,int to,Map<Integer,List<E>> map){
		
		LinkedList<Integer> index = new LinkedList<Integer>();
		LinkedList<Integer> pos = new LinkedList<Integer>();
		LinkedList<E> path = new LinkedList<E>();
		
		pos.addLast(from);
		index.addLast(-1);
		int sum = 0;
		
		for(;;){	
			
			int current = pos.removeLast();
			int start = index.removeLast();
			
			if(current == to){
				int flow = 2;
				for(E e : path){
					flow = Math.min(flow,e.cap);
				}
				int cnt = path.size();
				int x = 0;
				for(E e: path){
					e.cap -= flow;
					e.rev.cap += flow;
					if(e.cap == 0){
						x = cnt;
					}
				}
				for(int i = 0; i< x; i++){
					path.removeLast();
					pos.removeLast();
					index.removeLast();
				}
				sum += flow;
				continue;
			}
			
			List<E> l = map.get(current);

			boolean found = false;
			for(int i = start+1; i < l.size(); i++){
				E e = l.get(i);
				
				if(e.cap > 0 && depth[e.from] > depth[e.to]){
					pos.addLast(current);
					index.addLast(i);
					
					path.addLast(e);
					
					pos.addLast(e.to);
					index.addLast(-1);
					
					found = true;
					break;
				}
			}
			if(found){
				continue;
			}
			if(path.isEmpty()){
				break;
			}
			path.removeLast();
		}
		return sum;
	}
	
	
}
class E{
	int from;
	int to;
	int cap;
	E rev;
}

public class Main {
	public static void main(String[] args){
		Solver s  = new Solver();
		s.run();
	}
}


