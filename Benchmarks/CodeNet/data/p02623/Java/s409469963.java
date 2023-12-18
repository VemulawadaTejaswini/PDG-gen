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
        long[]pre= new  long[n+1];
        TreeMap<Long,Integer>tm= new TreeMap<>();
        int ans=0;
        tm.put(0l,0);
        for (int i =0;i<n;i++){
            pre[i+1]=a[i];
            pre[i+1]+=pre[i];
            tm.put(pre[i+1],i+1);
        }
        long cur=0;
        ans=tm.get(tm.floorKey(1l*k));
        for (int i =0;i<m;i++){
            cur+=b[i];
            if (cur>k)
                break;
            ans=Math.max(ans,i+1+tm.get(tm.floorKey(k-cur)));
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