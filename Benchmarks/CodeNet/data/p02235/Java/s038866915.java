import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		final int q = sc.nextInt();
		for(int tt = 0; tt < q; tt++){
			char[] c1 = sc.next().toCharArray();
			char[] c2 = sc.next().toCharArray();
			
			int[][] DP = new int[c1.length + 1][c2.length + 1];
			for(int i = 1; i <= c1.length; i++){			
				for(int j = 1; j <= c2.length; j++){
					if(i != 0){ DP[i][j] = Math.max(DP[i][j], DP[i - 1][j]); }
					if(j != 0){ DP[i][j] = Math.max(DP[i][j], DP[i][j - 1]); }
					if(i != 0 && j != 0){ DP[i][j] = Math.max(DP[i][j], DP[i - 1][j - 1] + (c1[i - 1] == c2[j - 1] ? 1 : 0)); }
				}
			}
			
			System.out.println(DP[c1.length][c2.length]);
		}
	}

	public static class Scanner {
		private BufferedReader br;
		private StringTokenizer tok;

		public Scanner(InputStream is) throws IOException {
			br = new BufferedReader(new InputStreamReader(is));
		}

		private void getLine() throws IOException {
			while (!hasNext()) {
				tok = new StringTokenizer(br.readLine());
			}
		}

		private boolean hasNext() {
			return tok != null && tok.hasMoreTokens();
		}

		public String next() throws IOException {
			getLine();
			return tok.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public void close() throws IOException {
			br.close();
		}
	}

}