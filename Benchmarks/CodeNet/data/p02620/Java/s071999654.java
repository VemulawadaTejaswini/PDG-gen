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
			for (int j=0;j<26;j++) {
				s[i][j] = in.nextInt();
			}
		}
		long tmp = 0L;
		int[] before_ind = new int[26];
		ArrayList<TreeSet<Integer>> list = new ArrayList<TreeSet<Integer>>();
		for (int i=0;i<26;i++) {
			TreeSet<Integer> add = new TreeSet<Integer>();
			add.add(-1);
			add.add(D);
			list.add(add);
		}
		Arrays.fill(before_ind, -1);
		int[] t = new int[D];
		for (int i=0;i<D;i++) {
			t[i] = in.nextInt()-1;
			list.get(t[i]).add(i);
			for (int j=0;j<26;j++) {
				if (j != t[i]) tmp -= (long)c[j]*(i-before_ind[j]);
				else {
					tmp += s[i][j];
					before_ind[j] = i;
				}
			}
		}
		int M = in.nextInt();
		for (int i=0;i<M;i++) {
			int d = in.nextInt()-1;
			int q = in.nextInt()-1;
			list.get(t[d]).remove(d);
			list.get(q).add(d);

			int high_d_1 = list.get(t[d]).higher(d);
			int low_d_1 = list.get(t[d]).lower(d);
			int high_d_2 = list.get(q).higher(d);
			int low_d_2 = list.get(q).lower(d);

			tmp -= (long)c[t[d]]*(high_d_1-d)*(d-low_d_1);
			tmp += (long)c[q]*(high_d_2-d)*(d-low_d_2);

			tmp -= s[d][t[d]];
			tmp += s[d][q];

			long minus = (long)c[t[d]]*(high_d_1-d)*(d-low_d_1);
			long plus = (long)c[q]*(high_d_2-d)*(d-low_d_2);

			t[d] = q;
			out.println(tmp);
		}

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
