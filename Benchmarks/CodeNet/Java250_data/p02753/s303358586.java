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
	}
	public static void main(String[] args) {
		FastReader ob = new FastReader();
		String s = ob.next();
		int arr[] = new int[2];
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)-'A']++;
		}
		if(arr[0]==3 || arr[1]==3) {
			System.out.println("No");
			return;
		}
		System.out.println("Yes");
		
	}

}
