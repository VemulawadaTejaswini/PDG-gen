import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;
    static final int ALF = 26;

    Main() {
        Scanner sc = new Scanner(System.in);
        long ans = 0;
        long N = sc.nextInt();
        long K = sc.nextInt();
        for (long f = K; f <= N; f++) {
            long min = (f)*(f-1)/2;;
            long max = (N+1)*(N)/2 - (N+1-f)*(N-f)/2;
            ans += max-min+1;
            ans%=MOD;
            
            // System.out.println(min);
            // System.out.println(max);
        }
        System.out.println(ans+1);
    }

    public static void main(String[] args) {
        new Main();
    }
}
