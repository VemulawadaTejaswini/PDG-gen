import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.StringTokenizer;

class Main {
	
	static class LongestCommon {
		public void longestcommon (InputReader in) {
			
			int n = in.nextInt();
			
			for (int i = 0; i < n; i++) {
				char[] str1 = in.nextString().toCharArray();
				char[] str2 = in.nextString().toCharArray();
				
				int len1 = str1.length;
				int len2 = str2.length;
				
				int[][] lc = new int[len1 + 1][len2 + 1];
				for (int j = 0; j < len1; j++) {
					for (int k = 0; k < len2; k++) {
						if (str1[j] == str2[k]) {
                            lc[j + 1][k + 1] = lc[j][k] + 1;
                        } else {
                            lc[j + 1][k + 1] = Math.max(lc[ j + 1][k], lc[j][k + 1]);
                        }
					}
				}
				
				System.out.println(lc[len1][len2]);
				
			}
			
		}
	}
	
	static class InputReader {
		BufferedReader input;
		StringTokenizer tok;
		
		public String nextString() {
			
			 while (!tok.hasMoreTokens()) {
	                try {
	                    tok = new StringTokenizer(input.readLine(), " ");
	                } catch (IOException e) {
	                    throw new InputMismatchException();
	                }
	            }
			return tok.nextToken();
		}
		
		public int nextInt() {
			return Integer.parseInt(nextString());
		}
					
		public InputReader (InputStream inputStream) {
			input = new BufferedReader (new InputStreamReader (inputStream));
			tok = new StringTokenizer ("");
		}
		
	}
	
	public static void main (String[] args) {
		InputStream inputStream = System.in;
		InputReader in = new InputReader (inputStream);
		LongestCommon obj = new LongestCommon();
		obj.longestcommon(in);
		
		
	}
}
