
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{		// codechef     atcoder

    static FastScanner in;
    static PrintWriter out;
    static final int mod = 1000000007;
    static final long modL = 100000000000000000l;

    static int caseCounter = 1;

    // ----------------------- my solution starts -----------------------
    static void solve() {
        int N = in.nextInt();
        int [] A = in.getArrayInt(N);
        Arrays.sort(A);
        int score = 0;
        int s1=N-1, s2=A[N-2];
        for(int i=N-2;i>=0;i--){
            if(s1>s2){
                score+=s1;
                s1=A[i];
            }else{
                score+=s2;
                s2=A[i];
            }
        }
        out.println(score);
    }
// ====================== my solution ends ==========================

    static void y() {
        out.println("YES");
    }

    static void n() {
        out.println("NO");
    }
    // part of pre-defined template

    static void gcjPrint(Object o) {
        out.print("Case #" + caseCounter + ": ");
        out.println(o);
        caseCounter++;
    }

    static long modI(long i, Boolean isMod) {
        if (isMod) {
            if (i >= mod)
                i = i % mod;
            return i;
        }
        if (i > modL)
            i = i % mod;
        return i;
    }

    public static void run() {
        in = new FastScanner();
        out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        solve();
        out.close();
    }

    public static void main(String[] args) {
        run();
    }

    private static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String nextToken() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int[] getArrayInt(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextInt();
            }
            return arr;
        }

        long[] getArrayLong(int n) {
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextLong();
            }
            return arr;
        }

        int nextInt() {
            return Integer.parseInt(nextToken());
        }

        long nextLong() {
            return Long.parseLong(nextToken());
        }

        double nextDouble() {
            return Double.parseDouble(nextToken());
        }
    }

}