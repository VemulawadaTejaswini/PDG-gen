import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
        	int n = in.nextInt();
        	int a[] = new int [n];
        	for (int i = 0; i < a.length; i++) {
        		a[i] = in.nextInt();
        	}
        	
        	int num = 0;
        	boolean flag = true;
        	while (flag) {
        		flag = false;
        		for (int i = a.length - 1; i > 0; i --) {
        			if (a[i] < a[i-1]) {
        				int t = a[i];
        				a[i] = a[i-1];
        				a[i-1] = t;
        				flag = true;
        				num += 1;
        			}
        		}
        	}
        	
        	String s = new String();
        	for (int i = 0; i < a.length; i++) {
        		s = s.concat(Integer.toString(a[i]));
        		if (i + 1 != a.length) s = s.concat(" ");
        	}
        	
        	out.println(s);
        	out.println(num);
        }
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
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