import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;
    static final int ALF = 26;

    Main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            int tmp = i;
            while (tmp > 0) {
                cnt += tmp % 10;
                tmp /= 10;
            }
            if (a <= cnt && cnt <= b) {
                ans += i;
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        new Main();
    }
}
