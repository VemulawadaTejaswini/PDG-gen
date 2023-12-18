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
		char[]s=sc.next().toCharArray();
		char []t=sc.next().toCharArray();
		
		
		int ans =t.length;
		int temp=t.length;
		for (int i = 0; i < s.length; i++) {
			
			if (t[0]==s[i])
			{
				int ii=i,c=0;
				for (int j = 0; j < t.length; j++) {
					if (t[j]==s[ii])
					{
						ii++;
					}
					else
						c++;
					
				}
				//System.out.println(temp);
				temp=Math.min(temp,c);
				
				
			}
		}
		int ncc=0;
		for (char c:s) {
			for(char sub:t)
			{
				if (c==sub)
				{
					ncc++;
					break;
					
				}
			}
			
		}
		
		if (ncc!=0 && temp==t.length)
		{
			temp--;
		}
		
		System.out.println(temp);
		
		
		
		
		
		

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
