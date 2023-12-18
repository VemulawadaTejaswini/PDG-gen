import java.util.*;
import java.io.*;
import java.text.*;
import java.util.zip.Adler32;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] a= sc.nextIntArr(n);
        int[] b = sc.nextIntArr(m);
        int i =0;int j=0;
        int ans=0;
        while (i<n&&j<m&&k>0){
            if (a[i]<b[j]){
                if (a[i]>k)
                    break;
                ans++;
                k-=a[i++];
            }else {
                if (b[j]>k){
                    break;
                }
                ans++;
                k-=b[j++];
            }
        }
        while (i<n&&a[i]<=k){
            ans++;
            k-=a[i++];
        }
        while (j<m&&b[j]<=k){
            ans++;
            k-=b[j++];
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