import java.io.*;
import java.util.*;
 
public class Main {
    static final long MOD = 1000000007L;
    static final int INF = 50000000;
    static final int NINF = -50000000;
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);
        
        int N = sc.ni();
        long[] nums = new long[N];
        for (int i = 0; i < N; i++) {
        	nums[i] = sc.nl();
        }
        
        
        
        long g = nums[0];
        for (int i = 1; i < N; i++) {
        	g = gcd(g,nums[i]);
        }
        
        boolean[] isPrime = new boolean[1000001];
        Arrays.fill(isPrime, true);
        for (int i = 2; i <= 1000000; i++) {
        	if (isPrime[i]) {
        		for (int j = 2*i; j <= 1000000; j += i) {
        			isPrime[j] = false;
        		}
        	}
        }
        
        boolean pairwise = true;
        if (N <= 78498) {
        	HashSet<Integer> primes = new HashSet<Integer>();
        	check:
        	for (int i = 0; i < N; i++) {
        		int n = (int)nums[i];
        		if (isPrime[n]) {
        			if (primes.contains(n)) {
        				pairwise = false;
        				break check;
        			} else {
        				primes.add(n);
        			}
        		} else {
        			int p = 2;
        			while (n > 1 && p*p <= nums[i]) {
        				int cnt = 0;
        				while (n%p==0) {
        					n /= p;
        					cnt++;
        				}
        				if (cnt > 0) {
                			if (primes.contains(p)) {
                				pairwise = false;
                				break check;
                			} else {
                				primes.add(p);
                			}
        				}
        				p++;
        			}
        			if (n > 1) {
            			if (primes.contains(n)) {
            				pairwise = false;
            				break check;
            			} else {
            				primes.add(n);
            			}
        			}
        		}
        	}
        } else {
        	pairwise = false;
        }
        
        if (pairwise) {
        	pw.println("pairwise coprime");
        } else if (g==1) {
        	pw.println("setwise coprime");
        } else {
        	pw.println("not coprime");
        }
        pw.close();
    }
    
    //Find the GCD of two numbers
    public static long gcd(long a, long b) {
      if (a < b)
        return gcd(b,a);
      if (b == 0)
        return a;
      else
        return gcd(b,a%b);
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
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int ni() {
            return Integer.parseInt(next());
        }
 
        long nl() {
            return Long.parseLong(next());
        }
 
        double nd() {
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