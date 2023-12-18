import java.io.BufferedReader;
import java.util.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.StringTokenizer;

 
public class Main {
	public static void main(String[] args) {
		FastScanner fs=new FastScanner();
		String s,t;
		s = fs.next();
		t = fs.next();
		int n = s.length();
		int m = t.length();
		int ans = Integer.MAX_VALUE;
		for(int i=0;i+m-1<n;i++) {
			int chn =0;
			for(int j=0;j<m;j++) {
				chn += (s.charAt(i+j)!=t.charAt(j))?1:0;
			}
			ans = Math.min(ans,chn);
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