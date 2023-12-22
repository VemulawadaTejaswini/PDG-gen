import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public final class Main {

    public static void main(String[] args) {
        final FastScanner fs = new FastScanner();
        final long a = fs.nextInt();
        final long b = fs.nextInt();
        final long c = fs.nextInt();
        final long d = fs.nextInt();


        long answer = 0;


        if(a>0 && d<0 || b<0 && c>0) {
        	// MAXが負になるパターン
        	answer = Math.multiplyExact(a, c);

        }


		if(Math.multiplyExact(a, c) > answer) {
			answer = Math.multiplyExact(a, c);
		}
		if(Math.multiplyExact(a, d) > answer) {
			answer = Math.multiplyExact(a, d);
		}

		if(Math.multiplyExact(b, c) > answer) {
			answer = Math.multiplyExact(b, c);
		}
		if(Math.multiplyExact(b, d) > answer) {
			answer = Math.multiplyExact(b, d);
		}
		System.out.print(answer);




    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    //noinspection CallToPrintStackTrace
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            final int[] a = new int[n];
            for (int i = 0; i < n; i++) { a[i] = nextInt(); }
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}