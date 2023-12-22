import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());
        if (n == 0) {
            System.out.println(x);
            return;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 101; i++) {
            list.add(i);
        }
        Integer[] p = new Integer[n];
        for (int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(p, Comparator.reverseOrder());
        for (int i = 0; i < n; i++) {
            list.remove(p[i]);
        }
        int sub = 101;
        Queue<Integer> q = new PriorityQueue<>();
        for (int a : list) {
            if (sub == Math.abs(a - x)) {
                sub = Math.abs(a - x);
                q.add(a);
            } else if (sub > Math.abs(a - x)) {
                sub = Math.abs(a - x);
                q.clear();
                q.add(a);
            }
        }
        System.out.println(q.peek());
    }
}