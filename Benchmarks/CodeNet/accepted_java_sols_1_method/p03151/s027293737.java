import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        long as = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            as += a[i];
        }
        long bs = 0;
        PriorityQueue<Integer> plus = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> minus = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
            bs += b[i];
            int gap = a[i] - b[i];
            if (gap > 0) {
                plus.add(gap);
            } else if (gap < 0) {
                minus.add(-gap);
            }
        }
        if (bs > as) {
            System.out.println(- 1);
            return;
        }
        if (minus.isEmpty()) {
            System.out.println(0);
            return;
        }
        int ans = 0;
        int yojo = 0;
        while (!minus.isEmpty()) {
            int tarinai = minus.poll();
            while (yojo < tarinai) {
                ans++;
                yojo += plus.poll();
            }
            yojo -= tarinai;
            ans++;
        }
        System.out.println(ans);
    }
}