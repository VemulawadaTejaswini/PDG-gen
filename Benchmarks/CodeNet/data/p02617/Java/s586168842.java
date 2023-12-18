
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        long ans = 0;
        for (int i =1;i<=n;i++){
            ans+=1l*i*(n-i+1);
        }
        int[][]a = new int[n][2];
        for (int i =0;i<n-1;i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            a[i][0] = Math.min(x, y);
            a[i][1] = Math.max(x, y);
            ans-=(1l*a[i][0]*(n-a[i][1]+1));
        }
        pw.println(ans);
        pw.flush();
    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(FileReader r) {
            br = new BufferedReader(r);
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

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public int[] nextIntArr(int n) throws IOException {
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++)
                arr[i] = nextInt();
            return arr;
        }

        public boolean ready() throws IOException {
            return br.ready();
        }

    }
}