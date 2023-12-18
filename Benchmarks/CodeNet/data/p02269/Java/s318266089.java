import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StreamTokenizer;
import java.util.HashSet;
import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Printer pr = new Printer(System.out);

		int n = sc.nextInt();
		HashSet<String> ht = new HashSet<String>();
		
    	for (int i = 0; i < n; i++) {
    		String cmd = sc.next();
    		if (cmd.equals("insert")) {
    			ht.add(sc.next());
    		} else if (cmd.equals("find")) {
    			if (ht.contains(sc.next())) {
    				pr.println("yes");
    			} else {
    				pr.println("no");
    			}
    		}
    	}

    	pr.close();
    	sc.close();
	}

	private static class Scanner {
		InputStreamReader isr;
		BufferedReader br;
		StreamTokenizer st;
		
		Scanner (InputStream in) {
			isr = new InputStreamReader(in);
			br = new BufferedReader(isr);
			st = new StreamTokenizer(br);
		}
		
		String next() throws RuntimeException  {
			try {
				if (st.nextToken() != StreamTokenizer.TT_WORD) {
				}
			} catch (IOException e) {
				throw new IllegalStateException();
			}
			
			return st.sval;
		}
		
		int nextInt() throws RuntimeException {
			try {
				if (st.nextToken() != StreamTokenizer.TT_NUMBER) {
					throw new InputMismatchException();
				}
			} catch (IOException e) {
				throw new IllegalStateException();
			}
			
			return (int)st.nval;
		}

		void close() {
		}
	}
	
	private static class Printer {
		OutputStreamWriter osw;
		BufferedWriter bw;

		Printer(OutputStream out) {
			osw = new OutputStreamWriter(out);
			bw = new BufferedWriter(osw);
		}

		void println(String str) {
			try {
				bw.write(str);
				bw.newLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		void close() {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}