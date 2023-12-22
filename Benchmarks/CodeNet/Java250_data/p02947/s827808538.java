import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		Task solver = new Task();
		solver.solve(1, in, out);
		out.close();
	}
	
	static class Task{
		public void solve(int numTest, InputReader in, PrintWriter out) {
			int n = in.nextInt();
			String[] inputString = new String[n];
			for(int testcase = -1; ++ testcase < n;) {
				inputString[testcase] = sortString(in.next().toCharArray());
			}
			Arrays.sort(inputString);
			 
			long res = 0, count = 1;
			for(int i = 0; ++i < n;) {
				if(!inputString[i].equals(inputString[i-1])) {
					res+=count*(count-1)/2;
					count = 0;
					
				}
				++count;
				
			}
			
			out.print(res+count*(count-1)/2);
		}

		private String sortString(char[] charArray) {
			Arrays.sort(charArray);
			return String.copyValueOf(charArray);
		}
	}
	
	
/*
5
4 5
2 1
3 2
2 5

*/				
	
	static class InputReader{
		public BufferedReader reader;
		public StringTokenizer tokenizer;
		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
			tokenizer = null;
		}
		public String next() {
			while(tokenizer==null||!tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
		
	}
		
}