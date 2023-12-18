import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		final Scanner sc = new Scanner(System.in);
		
		final char[] s1 = sc.next().toCharArray();
		final char[] s2 = sc.next().toCharArray();
		
		final int min_len = Math.min(s1.length, s2.length);

		int[] count1 = new int[1000];
		int[] count2 = new int[1000];
		
		for(int len = min_len; len >= 1; len--){
			Arrays.fill(count1, 0);
			for(int i = 0; i < len; i++){
				count1[s1[i] - 'a']++;
			}
			
			for(int fst = 0; fst <= (s1.length - len); fst++){
				Arrays.fill(count2, 0);
				for(int j = 0; j < len; j++){
					count2[s2[j] - 'a']++;
				}
				
				for(int snd = 0; snd <= (s2.length - len); snd++){
					boolean ok = true;
					for(int k = 0; k < count1.length; k++){
						if(count1[k] != count2[k]){
							ok = false;
							break;
						}
					}
					
					if(ok){
						System.out.println(len);
						return;
					}
					
					count2[s2[snd] - 'a']--;
					if(snd + len < s2.length){
						count2[s2[snd + len] - 'a']++;
					}
				}
				
				count1[s1[fst] - 'a']--;
				if(fst + len < s1.length){
					count1[s1[fst + len] - 'a']++;
				}
			}
		}
		
		System.out.println(0);
	}

	public static class Scanner implements Closeable {
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

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public void close() throws IOException {
			br.close();
		}
	}
}