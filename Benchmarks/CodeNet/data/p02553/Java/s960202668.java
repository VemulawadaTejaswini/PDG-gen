import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

//Main
public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		
		long a=sc.nextInt(),b=sc.nextInt(),
				c=sc.nextInt(),d=sc.nextInt();
		if (b<0 && d<0 || b>0 && d>0)
			System.out.println(b*d);
		else
		{
			if (b==0 || d==0)
			{
				System.out.println(a*c);
			}
			else
			{
				if (d<0)
				{
					long min=Math.min(a, b);
					System.out.println(min*d);
					
				}
				else
				{
					long min=Math.max(c, d);
					System.out.println(min*b);
				}
			}
			
			
			
			
		}
		
	}

	static final Random random = new Random();

	static void ruffleSort(int[] a) {
		int n = a.length;//shuffle, then sort 
		for (int i = 0; i < n; i++) {
			int oi = random.nextInt(n), temp = a[oi];
			a[oi] = a[i];
			a[i] = temp;
		}
		Arrays.sort(a);
	}

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
