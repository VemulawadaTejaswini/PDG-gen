import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {

    static final int MOD = 1000000007;
    static final int INF = 1 << 30;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        boolean[] AC = new boolean[N];
        int[] WA = new int[N];
        int acc = 0;
        int wac = 0;
        for (int i = 0; i < M; i++) {
            int p = sc.nextInt()-1;
            boolean ac = sc.next().equals("AC");

            if (AC[p])
                continue;
            if (ac) {
                acc++;
                wac += WA[p];
                AC[p]=true;
            } else {
                WA[p]++;
            }
        }
        System.out.println(acc + " " + wac);
    }
}
