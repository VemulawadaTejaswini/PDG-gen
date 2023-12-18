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

		Set<Integer> endcheck = new HashSet<>();
		endcheck.add(1);
		Set<Integer> start = new HashSet<>();
		start.add(1);

		do {
			Set<Integer> tmpst = new HashSet<>();

			Iterator<Integer> stit = start.iterator();
			while(stit.hasNext()) {
				int v1 = stit.next();

				int tdist = dist[v1] + 1;

				Iterator<Integer> adjit = adj[v1].iterator();
				while(adjit.hasNext()) {
					int v2 = adjit.next();
					if(!endcheck.contains(v2)) {
						tmpst.add(v2);
						endcheck.add(v2);

						if(dist[v2] < 1 || dist[v2] > tdist) {
							dist[v2] = tdist;
							ans[v2] = v1;
						}
					}

				}
			}

			start = tmpst;

		}while(endcheck.size() < n);

		System.out.println("Yes");
		for(int i = 2; i < n+1; i++) {
			System.out.println(ans[i]);
		}


	}

}
