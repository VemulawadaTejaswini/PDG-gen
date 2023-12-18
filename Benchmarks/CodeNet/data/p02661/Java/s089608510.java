import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    long mod = 1000000000+7;

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solve();
//        out.println(main.solve());
        out.flush();
    }
    void solve() throws IOException {
        int n = sc.nextInt();
        long[] a = new long[n], b = new long[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextLong(); b[i] = sc.nextLong();
        }
        Arrays.sort(a); Arrays.sort(b);
        long ans;
        if(n%2==1) ans = solveOdd(a,b);
        else ans = solveEven(a,b);
        out.println(ans);
    }
    long solveOdd(long[] a, long[] b){
        int n = a.length;
        long lo = a[n/2], hi = b[n/2];
        return Math.abs(hi-lo)+1;
    }
    long solveEven(long[] a, long[] b){
        int n = a.length;
        long lo = a[n/2-1]+a[n/2], hi = b[n/2-1]+b[n/2];
        return Math.abs(hi-lo)+1;
    }
}