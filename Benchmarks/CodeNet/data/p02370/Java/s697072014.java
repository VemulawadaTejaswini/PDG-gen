
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		new Main().solver();
	}
	void solver(){
		Scanner sc=new Scanner(System.in);
		int V=sc.nextInt();
		int E=sc.nextInt();
		@SuppressWarnings("unchecked")
		ArrayList<Integer>[] e=new ArrayList[V];
		for(int i=0;i<V;i++){
			e[i]=new ArrayList<Integer>();
		}
		for(int i=0;i<E;i++){
			int s=sc.nextInt();
			int t=sc.nextInt();
			e[s].add(t);
		}
		ArrayDeque<Integer> ans=topological_sort(e,0);
		for(int i=0;i<ans.size();i++){
			System.out.println(ans.poll());
		}
		sc.close();
	}
	
	ArrayDeque<Integer> topological_sort(ArrayList<Integer>[] edges,int s){
		ord=new ArrayDeque<Integer>();
		visit=new boolean[edges.length];
		for(int i=0;i<edges.length;i++){
			if(!visit[i]){
				dfs(edges,i);
			}
		}
		return ord;
	}
	boolean[] visit;//true:?¨??????????false:?¨????????????????
	ArrayDeque<Integer> ord;
	void dfs(ArrayList<Integer>[] edges,int i){
		visit[i]=true;
		for(int j:edges[i]){
			if(!visit[j]){
				dfs(edges,j);
			}
		}
		ord.addFirst(i);
	}
}