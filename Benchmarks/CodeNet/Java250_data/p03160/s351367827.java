import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args)
	{
		FastScanner in =new FastScanner();
		int n=in.nextInt();
		int[] h=in.readArray(n);
		int[] dp=new int[n];
		for(int i=0;i<n;i++)
			dp[i]=Integer.MAX_VALUE;
		dp[0]=0;
		if(n>1)
		{
		dp[1]=Math.abs(h[1]-h[0]);
		for(int i=2;i<n;i++)
		{
			int diff1=Math.abs(h[i]-h[i-1]);
			int diff2=Math.abs(h[i]-h[i-2]);
			dp[i]=Math.min(dp[i-1]+diff1,dp[i-2]+diff2);
		}
		}
		System.out.println(dp[n-1]);
	}
	
static final Random random=new Random();
	
	static void ruffleSort(int[] a) {
		int n=a.length;//shuffle, then sort 
		for (int i=0; i<n; i++) {
			int oi=random.nextInt(n), temp=a[oi];
			a[oi]=a[i]; a[i]=temp;
		}
		Arrays.sort(a);
	}
	
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}
}
