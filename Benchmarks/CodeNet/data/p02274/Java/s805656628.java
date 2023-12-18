import java.util.*;
import java.io.*;

class Main {
	static PrintStream out = System.out;
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		Main main = new Main();
		main.solv();
	}
	private void solv() {
		int n = in.nextInt();
		int[] a = new int[n];
		long l = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		long ll = System.currentTimeMillis();
		int cnt = bubbleSort(a);
		long lll = System.currentTimeMillis();

		//out.println((ll-l)+"/"+(lll-ll));
		out.println(cnt);
	}

	private int bubbleSort(int[] a) {
		int cnt = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = a.length - 1; j > i; j--) {
				if (a[i] > a[j]) {
					cnt++;
				}
			}
		}
		return cnt;
	}

	private static class Scanner {
	    private BufferedReader in;

	    public Scanner(InputStream in) {
	        this.in = new BufferedReader(new InputStreamReader(in));
	    }

	    public String next() {
	        CharArrayWriter writer = new CharArrayWriter();
	        while (true) {
	            try {
	                int cp = in.read();
	                if (Character.isWhitespace(cp)) {
	                    return writer.toString();
	                }
	                writer.write(cp);
	            } catch (IOException e) {
	                throw new RuntimeException(e);
	            }
	        }
	    }

	    public int nextInt() {
	        String s = next();
	        return Integer.parseInt(s);
	    }
	}
}