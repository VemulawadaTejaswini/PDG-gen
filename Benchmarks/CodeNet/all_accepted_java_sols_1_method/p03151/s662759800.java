import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        PriorityQueue<Integer> surplus = new PriorityQueue<>(Comparator.reverseOrder());
        int count = 0;
        long shortage = 0L;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] == b[i]) continue;
            if (a[i] > b[i]) {
                surplus.add(a[i] - b[i]);
            } else {
                shortage += b[i] - a[i];
                count++;
            }
        }
        while (shortage > 0) {
            Integer i = surplus.poll();
            if (i == null) {
                System.out.println(-1);
                return;
            }
            shortage -= i;
            count++;
        }

        System.out.println(count);
    }
}
