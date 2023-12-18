import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

		int D = in.nextInt();
		int[] c = new int[26];
		int[][] s = new int[D][26];
		for (int i=0;i<26;i++) {
			c[i] = in.nextInt();
		}
		for (int i=0;i<D;i++) {
			int max_val = 0;
			int max_ind = 0;
			for (int j=0;j<26;j++) {
				s[i][j] = in.nextInt();
				if (max_val <= s[i][j]) {
					max_val = s[i][j];
					max_ind = j;
				}
			}
			out.println(max_ind+1);
		}
		// long tmp = 0L;
		// int[] before_ind = new int[26];
		// Arrays.fill(before_ind, -1);
		// for (int i=0;i<D;i++) {
		// 	int t = in.nextInt()-1;
		// 	for (int j=0;j<26;j++) {
		// 		if (j != t) tmp -= (long)c[j]*(i-before_ind[j]);
		// 		else {
		// 			tmp += s[i][j];
		// 			before_ind[j] = i;
		// 		}
		// 	}
		// 	out.println(tmp);
		// }
		out.close();
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}
