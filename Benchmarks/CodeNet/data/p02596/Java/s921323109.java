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
        int K = sc.nextInt();
        boolean[] map = new boolean[K + 1];
        int initial = 7;
        if (7 % K == 0) {
            System.out.println(1);
            return;
        }
        for (int i = 2; true; i++) {
            initial = initial*10+7;
            // initial %= K;
            // initial += 7;
            if (initial%K == 0) {
                System.out.println(i);
                return;
            }
            initial %= K;
            if (map[initial])
                break;
            map[initial] = true;
        }
        System.out.println("-1");
    }

    public static void main(String[] args) {
        new Main();
    }
}
