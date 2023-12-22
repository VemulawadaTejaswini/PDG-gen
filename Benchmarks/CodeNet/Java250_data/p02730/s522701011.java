import java.util.*;
import java.io.*;

public class Main {	
	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
		String S = fs.next();
		int N = S.length();

		if(isPalindrome(S)) {
        } else {
			System.out.println("No");
			return;
        }
    

		for(int i=0; i<(N-1)/4; i++){
			if(i<=(N-1)/2-1-i&&S.charAt(i)==S.charAt((N-1)/2-1-i)){
			continue;
			}else{
			System.out.println("No");
			return;
			}

		}
		for(int i=0; i<(N-1)/4; i++){
			if((N+3)/2-1-i<=N-1-i&&S.charAt((N+3)/2-1+i)==S.charAt(N-1-i)){
			continue;
			}else{
			System.out.println("No");
			return;
			}

		}

		
		System.out.println("Yes");

		
		

	}
	
	public static boolean isPalindrome(String sentence) {
        int minIdx = 0;
        int maxIdx = sentence.length() - 1;
 
        while(minIdx < maxIdx) {
            if(sentence.charAt(minIdx++) != sentence.charAt(maxIdx--)) {
                return false;
            }
        }
        return true;
    }

	
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");

		public String next() {
			while (!st.hasMoreElements())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) {
				a[i]=nextInt();
			}
			return a;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

	}
	
}
