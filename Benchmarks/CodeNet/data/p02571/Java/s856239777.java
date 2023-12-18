import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
        FastScanner in = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        char s[] = in.next().toCharArray();
        char t[] = in.next().toCharArray();
        int n = s.length, m = t.length;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<=n-m;i++) {
        	int cnt = 0;
        	for(int j=0;j<m;j++) {
        		if(t[j]==s[j+i]) continue;
        		else {
        			cnt++;
        		}
        	}
        	min = Math.min(min, cnt);
        }
        out.println(min);
        out.flush();
	}
	
	static class FastScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");
		
		String next() {
			while(!st.hasMoreTokens())
				try {
					st = new StringTokenizer(br.readLine());
				}catch(IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		
		long nextLong() {
			return Long.parseLong(next());
		}
		
		int[] readArray(int n) {
			int a[] = new int[n];
			for(int i=0;i<n;i++) a[i] = nextInt();
			return a;
		}
		
		long[] readArray(int n,long x) {
			long a[] = new long[n];
			for(int i=0;i<n;i++) a[i] = nextLong();
			return a;
		}
		
	}
	
	static boolean arrayEquals(char a[], char b[]) {
		int n = a.length;
		boolean verdict = true;
		for(int i=0;i<n;i++) {
			if(a[i]!=b[i]) {
				verdict = false;break;
			}
		}
		return verdict;
	}
	
	static long lcm(long a, long b) {
		return (a*b)/gcd(a,b);
	}
	
	static long gcd(long a, long b) {
		if(b==0) return a;
		else return gcd(b,a%b);
	}
}







