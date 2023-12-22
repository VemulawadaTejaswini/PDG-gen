import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static class FastReader{
		BufferedReader br;
		StringTokenizer st;
		public FastReader() {
			br =  new BufferedReader(new InputStreamReader(System.in));
		}
		String next() {
			while(st==null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
					
				}
				catch(IOException e) {
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
	}
	public static void main(String[] args) {
		FastReader ob = new FastReader();
		long n=ob.nextLong(),a=ob.nextLong(),b=ob.nextLong();
		long q=n/(a+b),r=n%(a+b);
		long ans=(q*a);
		if(a<r) {
			ans+=a;
		}
		else if(a>=r && a!=0) {
			ans+=r;
		}
		System.out.println(ans);
		
	}

}
