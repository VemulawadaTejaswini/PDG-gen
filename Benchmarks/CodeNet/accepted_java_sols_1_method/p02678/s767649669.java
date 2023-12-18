import java.util.*;
import java.io.PrintWriter;
public class Main{
	static ArrayList<Integer>[] list;
	static boolean[] visited;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		list=new ArrayList[n];
		visited=new boolean[n];
		int[] ans=new int[n];
		for(int i=0; i<n; i++){
			list[i]=new ArrayList<>();
		}
		for(int i=0; i<m; i++){
			int a=sc.nextInt()-1;
			int b=sc.nextInt()-1;
			list[a].add(b);
			list[b].add(a);
		}
		ArrayDeque<Integer> q=new ArrayDeque<>();
		q.add(0);
		visited[0]=true;
		while(!q.isEmpty()){
			int now=q.poll();
			for(int i:list[now]){
				if(!visited[i]){
					visited[i]=true;
					ans[i]=now;
					q.add(i);
				}
			}
		}
		System.out.println("Yes");
		for(int i=1; i<n; i++){
			System.out.println(ans[i]+1);
		}
	}
}
