import java.io.*;
import java.math.*;
import java.util.*;
public class Main { //Perform BFS from 2...N then use those values to print
	//Things learned: Strings = SLOW; Only time spent for such questions is printing 
	//(maybe use print writer) CASH MONEY BABY!!!

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int N = input.nextInt();
		int M = input.nextInt();
		ArrayList<Integer>[] graph = new ArrayList[N+1];
		for (int i = 1; i<=N; i++) {
			graph[i]=new ArrayList<Integer>();
		}
		for (int i = 0; i < M; i++) {
			int A = input.nextInt();
			int B = input.nextInt();
			graph[A].add(B);
			graph[B].add(A);
		}
		int[] ans = BFS(graph);
		boolean bad = false;
		for (int i = 2; i <= N; i++) {
			if (ans[i]==0) {
				bad=true;
				break;
			}
		}
		if (bad) {
			out.println("No");
			out.flush();
		}
		else {
			out.println("Yes");
			out.flush();
			for (int i = 2; i <= N; i++) {
				out.println(ans[i]);
				out.flush();
			}
		}
	}	
	public static int[] BFS(ArrayList<Integer>[] graph) {
		int[] ans = new int[graph.length];
		boolean[] vis = new boolean[graph.length];
		Queue<Integer> cur = new LinkedList<Integer>();
		cur.add(1);
		while (!cur.isEmpty()) {
			int size = cur.size();
			for (int i = 0; i < size; i++) {
				int curSTART = cur.poll();
				for (int j = 0; j < graph[curSTART].size(); j++) {
					if (!vis[graph[curSTART].get(j)]) {
						ans[graph[curSTART].get(j)]=curSTART;
						vis[graph[curSTART].get(j)]=true;
						cur.add(graph[curSTART].get(j));
					}
				}
			}
		}
		return ans;
	}
}
