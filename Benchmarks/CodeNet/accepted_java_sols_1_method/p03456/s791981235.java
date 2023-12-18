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

    Main() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        boolean ans = false;
        for (int a = 0; a <= 1000; a++) {
            if (a * a == Integer.parseInt(String.valueOf(A) + B))
                ans = true;
        }
        System.out.println(ans ? "Yes" : "No");
    }

    public static void main(String[] args) {
        new Main();
    }
}
