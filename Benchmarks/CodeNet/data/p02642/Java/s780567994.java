import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    long mod = 998244353;
    public static void main(String[] args) throws IOException {
        Main main = new Main();

        main.solve();
//        long ans = main.solve();

        out.flush();
    }
    void solve() throws IOException {
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) a[i] = sc.nextInt();
        Arrays.sort(a);
        int  maxn = a[n-1];
        boolean[] rec = new boolean[maxn+1];
        int ans = 0, idx = 0;
        while(idx<n){
            int r = idx, num = a[idx];
            while(r<n&&a[r]==num) r++;
            if(!rec[num]&&r-idx==1) ans++;
            if(!rec[num]){
                for(int j=num; j<=maxn; j+= num){
                    rec[j] = true;
                }
            }
            idx = r;
        }
        out.println(ans);
    }

    int paIn(String s){return Integer.parseInt(s);}
}