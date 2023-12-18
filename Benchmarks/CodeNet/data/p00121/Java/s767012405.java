import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {

	Scanner sc;
	
	void debug(Object...os){
		System.err.println(Arrays.deepToString(os));
	}
	
	int swap(int puzzle,int a,int b){
		int p=puzzle&7<<(a*3),q=puzzle&7<<(b*3);
		puzzle^=p|q;
		p>>>=a*3;q>>>=b*3;
		puzzle|=p<<(b*3)|q<<(a*3);
		return puzzle;
	}
	
	int solve(int puzzle){
		HashMap<Integer,Integer> visited=new HashMap<Integer,Integer>();
		LinkedList<Integer> queue=new LinkedList<Integer>();
		queue.addLast(puzzle);
		visited.put(puzzle,0);
		
		while(!queue.isEmpty()){
			int p=queue.poll();
			int times=visited.get(p);
			if(p==076543210)return times;
			++times;
			
			int pos=0;
			//0の位置を探す
			for(int i=0;i<8;++i){
				if((p&7<<(i*3))==0){
					pos=i;
				}
			}
			int temp;
			//縦
			temp=swap(p,pos,(pos+4)%8);
			if(!visited.containsKey(temp)){
				queue.addLast(temp);
				visited.put(temp, times);
			}
			//右
			if(pos%4!=3){
				temp=swap(p,pos,pos+1);
				if(!visited.containsKey(temp)){
					queue.addLast(temp);
					visited.put(temp, times);
				}
			}
			//左
			if(pos%4!=0){
				temp=swap(p,pos,pos-1);
				if(!visited.containsKey(temp)){
					queue.addLast(temp);
					visited.put(temp, times);
				}
			}
		}
		return -1;
	}
	
	int ni(){
		return sc.nextInt();
	}
	
	void io(){
		sc=new Scanner(System.in);
		while(sc.hasNext()){
			int puzzle=0;
			for(int i=0;i<8;++i){
				int n=ni();
				puzzle|=n<<(i*3);
			}
			System.out.println(solve(puzzle));
		}
		sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().io();
	}

}