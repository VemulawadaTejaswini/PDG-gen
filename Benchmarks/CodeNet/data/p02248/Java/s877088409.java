import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	private static FastScanner sc = new FastScanner();

	public static void main(String[] args) {
		char[] S = sc.next().toCharArray();
		char[] P = sc.next().toCharArray();
		int n = S.length;
		int m = P.length;

		int[] T = new int[m + 1];
		T[0] = -1;
		T[1] = 0;
		int i = 2;
		int j = 0;
		while(i <= m) {
			if(P[i-1] == P[j]) {
				T[i] = j + 1;
				i++;
				j++;
			} else if(j > 0) {
				j = T[j];
			} else {
				T[i] = 0;
				i++;
			}
		}

		i = 0;
		j = 0;
		StringBuilder ans = new StringBuilder();
		while(i + j < n) {
//			System.out.println("i = " + i);
			if(P[j] ==S[i + j]) {
				j++;
				if(j == m) {
					ans.append(i);
					ans.append("\n");
				} else {
					continue;
				}
			}
			i = i + j - T[j];
			if(j > 0) {
				j = T[j];
			}
		}

		System.out.print(ans);
	}

	static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) {
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
}