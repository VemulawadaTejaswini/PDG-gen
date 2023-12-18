import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();


		Set<Integer> adj[] = new HashSet[n+1];
		for(int i = 1; i<adj.length; i++) {
			adj[i] = new HashSet<Integer>();
		}


		for(int i = 0; i < m; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();

			adj[a].add(b);
			adj[b].add(a);
		}

		int[] dist = new int[n+1];
		dist[0] = 0;
		int[] ans = new int[n+1];

		boolean[] end = new boolean[n+1];
		end[1] = true;
		ArrayDeque<Integer> q = new ArrayDeque<>();
		q.add(1);

		while(!q.isEmpty()) {

			int v1 = q.poll();

			int tdist = dist[v1] + 1;

			Iterator<Integer> adjit = adj[v1].iterator();
			while(adjit.hasNext()) {
				int v2 = adjit.next();
				if(!end[v2]) {
					q.add(v2);
					end[v2] = true;

					dist[v2] = tdist;
					ans[v2] = v1;
				}
			}
		}

		System.out.println("Yes");
		for(int i = 2; i < n+1; i++) {
			System.out.println(ans[i]);
		}
	}

}
