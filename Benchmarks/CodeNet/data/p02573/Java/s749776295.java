import java.util.*;
import java.io.*;
public class Main {
	static ArrayList<Integer> arr[];
	static boolean visited[];
	static int ctr;
	static void dfs(int i) {
		for(int j: arr[i]) {
			if(!visited[j]) {
				visited[j]=true;
				ctr++;
				dfs(j);
			}
		}
	}
	public static void main(String args[]) {
		FastScanner in = new FastScanner();
		int n=in.nextInt();
		int m=in.nextInt();
		arr=new ArrayList[n+1];
		visited=new boolean[n+1];
		for(int i=0;i<=n;i++)
			arr[i]=new ArrayList<>();
		for(int i=0;i<m;i++) {
			int x=in.nextInt();
			int y=in.nextInt();
			arr[x].add(y);
			arr[y].add(x);
		}
		
		int ans=Integer.MIN_VALUE;
		for(int i=1;i<=n;i++) {
			if(!visited[i]) {
				ctr=1;
				visited[i]=true;
				dfs(i);
				ans=Math.max(ans, ctr);
			}
		}
		System.out.println(ans);
	}

	///////////////////////////
	static class FastScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");

		String next() {
			while (!st.hasMoreTokens())
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] readArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}
}
