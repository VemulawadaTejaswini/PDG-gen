import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args) {
		FastScanner fs=new FastScanner();
		int n = fs.nextInt();
		
		BigInteger a1[] = fs.readArray(n);

		BigInteger count = new BigInteger("0");
		for(int i =0;i<n;i++) {
			for(int j = i+1;j<n;j++) {
				BigInteger a = a1[i];
				BigInteger b = a1[j];
				BigInteger result = a.multiply(b).mod(BigInteger.TEN.pow(9).add(BigInteger.valueOf(7)));	
				count = count.add(result);
				
			}
			
		}
		System.out.println(count);
		
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
		BigInteger[] readArray(int n) {
			BigInteger[] a=new BigInteger[n];
			for (int i=0; i<n; i++) a[i]=new BigInteger(next());
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}

	
}
