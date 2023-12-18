
import java.util.*;
import java.io.*;

public class Main {
    static long get(long limit,long a,long b){
        ArrayList<Long>pows= new ArrayList<>();
        long x=0;
        for (int i =60;i>=0;i--){
            if ((1l<<i&a)!=(1l<<i&b)){
                pows.add(1l<<i);
            }
            else x|=(1l<<i &a);
        }
        for (long c:pows){
            if (c+x<=limit){
                x+=c;
            }
        }
        return x;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n= sc.nextInt();
        long[]a = new long[n];
        for (int i =0; i<n;i++)a[i]=sc.nextLong();
        long sum = a[0]+a[1];
        long xor=0;
        for (int i =2;i<n;i++)xor^=a[i];
        if (sum%2!=xor%2||sum<xor){
            pw.println(-1);
        }
        else {
            long s1=xor;
            long s2=sum-xor;
            s2/=2;
            s1+=s2;
            if ((s1^s2)==xor&&s1+s2==sum){
                long ans=get(a[0],s1,s2);
                if (ans<=a[0]&&ans>0){
                    pw.println(a[0]-ans);
                }
                else pw.println(-1);
            }
            else {
                pw.println(-1);
            }
        }
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