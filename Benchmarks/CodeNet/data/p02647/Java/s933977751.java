import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;
import static java.lang.Long.bitCount;

public class Main {

    public static void main(String[] args) {
        FastScanner in = new FastScanner();
        int n, k;
        n = in.nextInt();
        k = in.nextInt();
        int []a = new int[n+1];
        for(int i=1; i<=n; ++i)
            a[i] = in.nextInt();

        int []dp = new int[400100];;
        int itr = 0;
        while(true){
            if(itr == k)
                break;
            ++itr;
            int ok = 1;
            Arrays.fill(dp, 0);
            for(int i=1; i<=n; ++i){
                if(i-a[i]>=0) dp[i-a[i]]++;
                else dp[0]++;
                dp[i+a[i]+1]--;
            }
            for(int i=1; i<=n; ++i){
                dp[i] += dp[i-1];
            }
            for(int i=1; i<=n; ++i){
                if(dp[i] != a[i]){
                    ok = 0;
                    break;
                }
            }
            a = Arrays.copyOf(dp, 200100);
            if(ok == 1)
                break;
        }

        for(int i=1; i<=n; ++i){
            System.out.print(a[i] + " ");
        }
    }

    static void sort(int[] a) {
        ArrayList<Integer> l=new ArrayList<>();
        for (int i:a) l.add(i);
        Collections.sort(l);
        for (int i=0; i<a.length; i++) a[i]=l.get(i);
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

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}
