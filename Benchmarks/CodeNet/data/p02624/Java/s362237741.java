package Codes;

import java.util.Scanner;
import java.io.PrintWriter;

public class Task3 {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        long cnt[] = new long[n + 1];

        long tot = 1;
        for(int i = 2;i <= n; ++i){
            for(int j = i;j <= n; j += i){
                cnt[j]++;
            }
            cnt[i]++;
            tot += (i*cnt[i]);
        }
        out.println(tot);
    }
}
