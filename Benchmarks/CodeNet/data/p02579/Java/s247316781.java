

import java.util.*;
import java.io.*;

public class Main {
	static FastReader in = new FastReader();

	public static void main(String[] args) {
		solve();
	}	

	static int[] di = {0, 0, 1, -1};
    static int[] dj = {1, -1, 0, 0};
    static int INF = 100000000;
    static int h, w;
	
	static void solve() {
		h = in.nextInt();
		w = in.nextInt();
		int ch = in.nextInt() - 1;
		int cw = in.nextInt() - 1;
		int dh = in.nextInt() - 1;
		int dw = in.nextInt() - 1;
		
		String[][] arr = new String[h][w];
		for(int i = 0; i < h; i++)
		{
			arr[i] = in.nextLine().split("");
		}
		
		ArrayDeque<int[]> q = new ArrayDeque();
		int[][] dist = new int[h][w];
		for(int i = 0; i < h; i++) Arrays.fill(dist[i], INF);
		q.add(new int[] {ch, cw});
		dist[ch][cw]= 0;
		while(!q.isEmpty()) {
			int[] tmp = q.pollFirst();
			int i = tmp[0];
			int j = tmp[1];
			int curDist = dist[i][j];
			for(int k = 0; k < 4; k++)
			{
				int ni = i + di[k];
				int nj = j + dj[k];
				if(in(ni, nj) && arr[ni][nj].equals(".") && dist[ni][nj] > curDist)
				{
					dist[ni][nj] = curDist;
					q.addFirst(new int[] {ni, nj});
				}
			}
			
			for(int a = -2; a <= 2; a++)
			{
				for(int b = -2; b <= 2; b++)
				{
					int ni = i + a;
					int nj = j + b;
					if(in(ni, nj) && arr[ni][nj].equals(".") && dist[ni][nj] > curDist + 1)
					{
						dist[ni][nj] = curDist + 1;
						q.addLast(new int[] {ni, nj});
					}
				}
			}
			
			
		}
		int ret = dist[dh][dw];
		if(ret >= INF) ret = -1;
		System.out.println(ret);
		
	}
	static boolean in(int a, int b)
	{
		return 0 <= a && a < h && 0 <= b && b < w;
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

class Pair
{
	
}





