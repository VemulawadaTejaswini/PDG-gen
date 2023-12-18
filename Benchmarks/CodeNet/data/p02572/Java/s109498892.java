import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static double mod=  (1e9+7);
    public static void main(String[] args) {
        FastScanner fs=new FastScanner();
        int n=fs.nextInt();

        int[] in=fs.readArray(n);
        long sum=0;
        long ans=0;
        for (int i=0; i<n; i++) {
            ans+=(sum*in[i])%mod;
            ans%=mod;
            sum+=in[i];
            sum%=mod;
        }


        System.out.println((long)(ans%mod));
    }
    static class FastScanner {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
        int[] readArray(int n) {
            int[] a=new int[n];
            for (int i=0; i<n; i++) a[i]=nextInt();
            return a;
        }
        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
