import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main
{
	private static void solve(FastScanner fr) {
		int n = fr.nextInt();
		int k = fr.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = fr.nextInt();			

		int[] dp = new int[n];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;		
		for(int i = 0; i < n; i++) {
			for(int j = i-1; j >= i-k && j >= 0; j--) {
				dp[i] = Math.min(dp[i], dp[j] + Math.abs(arr[i] - arr[j]));
			}
			// sout(i + " " + dp[i]);
		}

		sout(dp[n-1]);
	}
    public static void main(String[] args) {
		FastScanner fs = new FastScanner();
		int n = 1;
		// int n = fs.nextInt();
		while (n-- > 0)	{
			solve(fs);
        }
    }

    private static void sout()          { System.out.println();  }
    private static void sout(String s)  { System.out.println(s); }
    private static void sout(int s)     { System.out.println(s); }
    private static void sout(long s)    { System.out.println(s); }
    private static void sout(double s)  { System.out.println(s); }
    
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try { st=new StringTokenizer(br.readLine()); } catch (IOException e) { e.printStackTrace(); }
			return st.nextToken();
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		int nextInt() {	return Integer.parseInt(next()); }
		long nextLong() { return Long.parseLong(next()); }
		double nextDouble() { return Double.parseDouble(next()); }
	}
}
