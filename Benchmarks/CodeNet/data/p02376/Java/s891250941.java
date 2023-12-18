
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

import org.w3c.dom.UserDataHandler;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {

		int v = sc.nextInt();
		int en = sc.nextInt();
		
		Map<Integer,List<E>> map = new HashMap<Integer,List<E>>();
		
		for(int i =0 ; i < en ;i++){
			
			E e = new E();
			E rev = new E();
			
			int from = sc.nextInt();
			int to = sc.nextInt();
			int cap = sc.nextInt();
			
			e.from = from;
			e.to = to;
			e.cap = cap;
			
			rev.from = to;
			rev.to = from;
			rev.cap = 0;
			
			e.rev = rev;
			rev.rev = e;
			
			map.computeIfAbsent(e.from, (__)->new LinkedList<E>()).add(e);
			map.computeIfAbsent(rev.from, (__)->new LinkedList<E>()).add(rev);			
		}
		
		E[][] edges = new E[v][];
		for(int i = 0; i < v; i++){
			edges[i] = map.getOrDefault(i,new LinkedList<E>()).toArray(new E[0]);
		}
		
		long ans = 0;
		
		int source = 0;
		int sink = v-1;
		
		int[] depth = new int[v];
		boolean[] visited = new boolean[v];
		
/*
 		for(int i = 0; i < edges.length; i++){
			System.out.println("from "+i);
			for(int j = 0 ; j < edges[i].length;j++){
				System.out.println("    to "+edges[i][j].to + "   cap "+edges[i][j].cap + "   revcap " + edges[i][j].rev.cap);
			}
		}
*/
		for(;;){	
			Arrays.fill(depth, v+1);
			Arrays.fill(visited, false);
			if(!bsf_back(edges,source,sink,depth,visited)){
				break;
			}
//			System.out.println(Arrays.toString(depth));
			ans += shortest_maxflow(edges,source,sink,depth);
		}
		
		System.out.println(ans);
	}
	
	int shortest_maxflow(E[][] edges,int source,int sink,int[] depth){
		
		
		Stack<Integer> stack = new Stack<Integer>();
		Stack<E> path = new Stack<E>();
		
		stack.push(-1);
		
		int ans = 0;
		
		int now = source;
		bfs: for(;;){	

			int i = stack.peek()+1;
			
			if(now == sink){
				
				
				int flow = Integer.MAX_VALUE /2;
				for(E used : path){
					flow = Math.min(flow, used.cap);
//					System.out.println(used.to + " <- " + used.from+"  "+used.cap);
				}
				
				int pos = 0;
				int ind = 0;
				for(E used : path){
					used.cap -= flow;
					used.rev.cap += flow;

					if(used.cap == 0 && pos == 0){
						pos = ind;
					}
					ind++;
				}
				E last = path.pop();
				i = stack.pop();
				for(int j =0 ; j < path.size() - 2 - pos; j++){
					last = path.pop();
					i = stack.pop();
				}
				now = last.from;		
				
				ans += flow;
				continue;
			}
			
			for(;i < edges[now].length;i++){
				if(depth[now] > depth[edges[now][i].to] && edges[now][i].cap > 0){
					stack.pop();
					stack.push(i);
					stack.push(-1);
					path.push(edges[now][i]);
					now = edges[now][i].to;
					continue bfs;
				}				
			}
			
			stack.pop();
			if(stack.isEmpty()){
				break;
			}
			now = path.pop().from;
		}
		
		return ans;
	}
	
	class State{
		int index;
	}
	
	
	boolean bsf_back(E[][] edges,int source,int sink,int[] depth,boolean[] visited){
		
		PriorityQueue<Pair> queue = new PriorityQueue<Pair>((p1,p2) -> Integer.compare(p1.depth , p2.depth));
		
		Pair init = new Pair();
		init.now = sink;
		init.depth = 0;
		
		queue.add(init);
		
		
		for(;;){
			
			if(queue.isEmpty()){
				return false;
			}
			Pair now = queue.poll();
			
			if(visited[now.now]){
				continue;
			}
//			System.out.println(now.now+" "+now.depth);
			
			depth[now.now] = now.depth;
			visited[now.now] = true;
			
			if(now.now==source){
				return true;
			}
			
			
			for(E edge_rev : edges[now.now]){
				E edge = edge_rev.rev;
				
				
				if(edge.cap > 0 && !visited[edge.from]){
					
					Pair next = new Pair();
					next.now = edge.from;
					next.depth = now.depth + 1;
					queue.add(next);
					
				}
							
			}
		}
		
	}
	
	
	
	class E{
		int from;
		int to;
		int cap;
		
		E rev;
	}
	
	class Pair{
		int now;
		int depth;
	}
	
}
