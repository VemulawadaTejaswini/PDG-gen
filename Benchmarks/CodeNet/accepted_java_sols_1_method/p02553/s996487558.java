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
        long A = sc.nextInt();
        long B = sc.nextInt();
        long C = sc.nextInt();
        long D = sc.nextInt();
        ans = Math.max(A*C,Math.max(A*D,Math.max(B*C,B*D)));//Math.max(,Math.max(,Math.max(,Math.max(,Math.max(,Math.max(,)))))))))
        System.out.println(ans);
    }

    public static void main(String[] args) {
        new Main();
    }
}
