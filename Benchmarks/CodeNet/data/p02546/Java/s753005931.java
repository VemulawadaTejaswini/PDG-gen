
import java.util.*;
import java.io.*;

public class Main {
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
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

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	

	public static void main(String[] args) throws FileNotFoundException {
	
	
 /*File file =new File("input.txt");
 Scanner scan=new Scanner(new FileInputStream(file));
 PrintWriter out=new PrintWriter("output.txt");
 */
FastReader scan=new FastReader();

String  m=scan.next();
if(m.charAt(m.length()-1)=='s'){
	System.out.print(m+"es");
}
else
System.out.print(m+""+"s");
	
	}
}


