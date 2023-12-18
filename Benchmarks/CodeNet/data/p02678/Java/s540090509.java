
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static class Vertex{
		List<Integer> adj;
		public Vertex() {
			adj = new ArrayList<Integer>();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Vertex vs[] = new Vertex[N];
		for(int i = 0 ; i < N ; ++i){
			vs[i] = new Vertex();
		}
		for(int i = 0 ; i < M ; ++i){
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			vs[a].adj.add(b);
			vs[b].adj.add(a);
		}
		Queue<Integer> q = new LinkedList<Integer>();
		int vis[] = new int[N];
		Arrays.fill(vis, -1);
		q.add(0);
		vis[0] = 0;
		while(!q.isEmpty()){
			int cp = q.poll();
			for(int a : vs[cp].adj){
				if(vis[a] >= 0){
					continue;
				}
				vis[a] = cp;
				q.add(a);
			}
		}
		System.out.println("Yes");
		for(int i = 1 ; i < N ; ++i){
			System.out.println(vis[i] + 1);
		}
	}	
}
