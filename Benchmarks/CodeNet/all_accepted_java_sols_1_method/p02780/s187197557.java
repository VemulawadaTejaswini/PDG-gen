
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt() + 1;
        }

        int max = 0;
        int s = 0;
        Queue<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            s += p[i];
            queue.add(p[i]);
            if (queue.size() > k) {
                s -= queue.poll();
            }
            if (queue.size() == k) {
                max = Math.max(max, s);
            }
        }

        System.out.println((double) max / 2);
    }
}