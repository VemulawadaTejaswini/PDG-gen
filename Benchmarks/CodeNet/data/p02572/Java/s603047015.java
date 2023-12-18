import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static double mod=  (1e9+7);
    public static void main(String[] args) {
        FastScanner fs=new FastScanner();
        int n=fs.nextInt();
        double[] arr=new double[n];
        long ans=0;
        for (int i=0; i<n; i++) {arr[i]=(double) fs.nextInt();
        ans+=arr[i];
        }
        double sum=0;
        for(int i=0;i<arr.length-1;i++ ){
            ans-=arr[i];
            sum+=(ans*arr[i])%mod;
        }

        System.out.println((long)(sum%mod));
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
        double[] readArray(int n) {
            double[] a=new double[n];
            for (int i=0; i<n; i++) a[i]=(double) nextInt();
            return a;
        }
        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
