

import java.util.*;
import java.io.*;

public class Main {
	static FastReader in = new FastReader();

	public static void main(String[] args) {
		solve();
	}

	static void solve() {
		int n = in.nextInt(), m = in.nextInt();
		
		LinkedList<Integer>[] edges = new LinkedList[n];
		for(int i = 0; i < n; i++) edges[i] = new LinkedList<>();
		for(int i = 0; i < m; i++)
		{
			int a = in.nextInt() - 1, b = in.nextInt() - 1;
			if(edges[a].contains(b)) continue;
			else
			{
				edges[a].add(b);
				edges[b].add(a);
			}
		}
		ff(n, edges);
	}
	
	static void ff(int n, LinkedList<Integer>[] adj)
	{
		Queue<Integer> q = new LinkedList<Integer>();
		int maxsize = 0;
		boolean[] visited = new boolean[n];
		for(int i = 0; i < n; i++)
		{
			if(!visited[i])
			{
				int currsize = 0;
				q.add(i);
				visited[i] = true;
				while(!q.isEmpty())
				{
					int curr = q.poll();
					currsize++;
					for(int adjnode : adj[curr])
					{
						if(visited[adjnode]) continue;
						visited[adjnode] = true;
						q.add(adjnode);
					}
				}
				maxsize = Math.max(currsize,  maxsize);
			}
			
		}
		System.out.println(maxsize);
	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

		int[] readarr(int abc) {
			int[] a = new int[abc];
			for (int i = 0; i < abc; i++)
				a[i] = nextInt();
			return a;
		}
	}
}



