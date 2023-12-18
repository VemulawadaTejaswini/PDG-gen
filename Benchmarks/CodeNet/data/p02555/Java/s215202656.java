import org.omg.CORBA.MARSHAL;

        import java.math.BigInteger;
        import java.util.*;
        import java.io.*;

public class Main {
    static long[]memo;
    static int mod = (int)1e9+7;
    static long dp(int sum){
        if (sum<=2)
            return sum==0?1:0;
        if (memo[sum]!=-1)
            return memo[sum];
        long ans=0;
        for (int i =3;i<=sum;i++){
            ans+=dp(sum-i);
            ans%=mod;
        }
        return memo[sum]=ans;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        memo= new long[n+1];
        Arrays.fill(memo,-1);
        pw.println(dp(n));
        pw.flush();

    }
    static class Scanner {
        BufferedReader br;
        StringTokenizer st;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(FileReader f) {
            br = new BufferedReader(f);
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public int[] nextIntArr(int n) throws IOException {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(next());
            }
            return arr;
        }

    }

}