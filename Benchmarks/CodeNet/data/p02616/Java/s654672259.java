import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
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
        long ans = 1;
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        LinkedList<Integer> positive = new LinkedList<Integer>();
        LinkedList<Integer> negative = new LinkedList<Integer>();
        for (int i = 0; i < N; i++) {
            if (A[i] < 0)
                negative.add(A[i]);
            else
                positive.add(A[i]);

        }
        for (int i = 0; i < K; i++) {
            if (K - i > 1) {
                if (positive.size() > 1 && negative.size() > 1) {
                    long p = positive.get(0) * positive.get(1);
                    long n = negative.get(0) * negative.get(1);
                    if (p > n) {
                        ans *= positive.pollFirst();
                        ans = mod(ans, MOD);
                        ans *= positive.pollFirst();
                        ans = mod(ans, MOD);
                    } else {
                        ans *= negative.pollFirst();
                        ans = mod(ans, MOD);
                        ans *= negative.pollFirst();
                        ans = mod(ans, MOD);
                    }
                } else if (positive.size() > 1) {
                    ans *= positive.pollFirst();
                    ans = mod(ans, MOD);
                    ans *= positive.pollFirst();
                    ans = mod(ans, MOD);
                } else if (negative.size() > 1) {
                    ans *= negative.pollFirst();
                    ans = mod(ans, MOD);
                    ans *= negative.pollFirst();
                    ans = mod(ans, MOD);
                } else {
                    ans *= positive.pollFirst();
                    ans = mod(ans, MOD);
                    ans *= negative.pollFirst();
                    ans = mod(ans, MOD);
                }
                i++;
            } else {
                if (!positive.isEmpty()) {
                    ans *= positive.pollFirst();
                    ans = mod(ans, MOD);
                } else {
                    ans = 1;
                    PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Comparator.comparing(Math::abs));

                    for (i = 0; i < N; i++)
                        queue.add(A[i]);
                    for (int k = 0; k < K; k++) {
                        ans *= queue.poll();
                        ans = mod(ans, MOD);
                    }
                }
                break;
            }
        }
        System.out.println(ans);
    }

    static long mod(long n, int m) {
        return (n % m) < 0 ? (n % m) + (m < 0 ? -m : m) : (n % m);
    }

    public static void main(String[] args) {
        new Main();
    }
}
