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
		int m=in.nextInt();
		int b=in.nextInt();
		int[][] dd=new int[n][m];
		for(int i=0;i<b;i++)
		{
			int x=in.nextInt()-1;
			int y=in.nextInt()-1;
			dd[x][y]=1;
		}
		int[] rsum=new int[n];
		int[] csum=new int[m];
		int ans=0;
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				rsum[i]+=dd[i][j];
//		System.out.println(Arrays.toString(rsum));
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				csum[i]+=dd[j][i];
//		System.out.println(Arrays.toString(csum));
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				ans=Math.max(ans, rsum[i]+csum[j]-dd[i][j]);
			}
		}
		System.out.println(ans);
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
