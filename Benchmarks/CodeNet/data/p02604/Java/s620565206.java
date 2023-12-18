
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

	static int INF = 1_000_000_000;
	static TreeSet<Integer> set_x;
	static TreeSet<Integer> set_y;
// global
// static long fact[];
// static long inverse[];
// static int mod = 1_000_000_007;

// static long pow(long a,int n) {
//     long res=1;
//     while (n>0) {
//         if ((n-n/2*2)==1) {
//             res=res*a%mod;
//         }
//         a=a*a%mod;
//         n>>=1;
//     }
//     return res;
// }

// static long modinv(long n) {
//     return pow(n, mod-2);
// }

// static long comb(int n,int k){
//     if(n<0 || k<0 || n<k)return 0;
//     return fact[n]*(inverse[k]*inverse[n-k]%mod) %mod;
// }

	static boolean next_permutation(int[] p) {
	  for (int a = p.length - 2; a >= 0; --a)
	    if (p[a] < p[a + 1])
	      for (int b = p.length - 1;; --b)
	        if (p[b] > p[a]) {
	          int t = p[a];
	          p[a] = p[b];
	          p[b] = t;
	          for (++a, b = p.length - 1; a < b; ++a, --b) {
	            t = p[a];
	            p[a] = p[b];
	            p[b] = t;
	          }
	          return true;
	        }
	  return false;
	}

	public static void main(String[] args) {
		InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

				// main method
		// fact=new long[200000];
		// fact[0]=1;
		// inverse=new long[200000];
		// inverse[0]=1;
		// for(int i=1;i<200000;i++){
		//     fact[i]=(fact[i-1]*(long)i)%mod;
		//     inverse[i]=modinv(fact[i]);
		// }
		// long tmpp = 0L;
		// for (int i=0;i<=15;i++) {
		// 	// tmp += comb(15, i)*pow(2, i);
		// 	tmpp += comb(15, i)*pow(2, i)*(15-i)*2*4;
		// 	System.out.println(tmpp);
		// }

		int N = in.nextInt();
		int[] X = new int[N];
		int[] Y = new int[N];
		int[] P = new int[N];
		for (int i=0;i<N;i++) {
			X[i] = in.nextInt();
			Y[i] = in.nextInt();
			P[i] = in.nextInt();
		}

		for (int i=0;i<=N;i++) {
			int[] arr = new int[N];
			for (int j=N-1;j>=N-i;j--) {
				arr[j] = 1;
			}
			int cnt = 0;
			long sum = 1_000_000_000_000_000_000L;

			do {
				ArrayList<Integer> use_index = new ArrayList<Integer>();
				ArrayList<Integer> not_use_index = new ArrayList<Integer>();
				for (int j=0;j<N;j++) {
					if (arr[j] == 1) use_index.add(j);
					else not_use_index.add(j);
				}
				for (int j=0;j<(1<<i);j++) {
					int tmp = j;
					int[] use_x = new int[i]; // else use_y
					for (int k=0;k<i;k++) {
						use_x[k] = tmp%2;
						tmp /= 2;
					}
					set_x = new TreeSet<Integer>();
					set_y = new TreeSet<Integer>();
					set_x.add(0);
					// set_x.add(INF);
					// set_x.add(-INF);
					set_y.add(0);
					// set_y.add(INF);
					// set_y.add(-INF);
					for (int k=0;k<i;k++) {
						// if (use_x[k] == 1) set_x.add(X[use_index.get(k)]);
						// else set_y.add(Y[use_index.get(k)]);
					}

					long sum_tmp = 0L;
					for (int k=0;k<N-i;k++) {
						long tmppp = INF;
						int x_val = X[not_use_index.get(k)];
						int y_val = Y[not_use_index.get(k)];
						long x_high = (set_x.higher(x_val-1)==null)?INF:set_x.higher(x_val-1);
						long x_low = (set_x.lower(x_val+1)==null)?(-INF):set_x.lower(x_val+1);
						long y_high = (set_y.higher(y_val-1)==null)?INF:set_y.higher(y_val-1);
						long y_low = (set_y.lower(y_val+1)==null)?(-INF):set_y.lower(y_val+1);
						// long x_high = set_x.higher(x_val-1);
						// long x_low = set_x.lower(x_val+1);
						// long y_high = set_y.higher(y_val-1);
						// long y_low = set_y.lower(y_val+1);

						// if (x_high != INF) {
							tmppp = Math.min(tmppp, x_high-x_val);
						// }
						// if (x_low != -INF) {
							tmppp = Math.min(tmppp, x_val-x_low);
						// }
						// if (y_high != INF) {
							tmppp = Math.min(tmppp, y_high-y_val);
						// }
						// if (y_low != -INF) {
							tmppp = Math.min(tmppp, y_val-y_low);
						// }
						sum_tmp += (long)tmppp*P[not_use_index.get(k)];
					}
					sum = Math.min(sum, sum_tmp);
					// System.out.println(Arrays.toString(use_x));
				}
		    	// System.out.println(Arrays.toString(arr));
			} while(next_permutation(arr));
			out.println(sum);
			// System.out.println(sum);
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