import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long countYen = 0;

        PriorityQueue<long[]> q = new PriorityQueue<>(Comparator.comparingLong(a -> a[0]));
        for (int i = 0; i < n; i++) {
            q.add(new long[]{sc.nextLong(), sc.nextLong()});
        }

        while (!q.isEmpty()) {
            long[] store = q.poll();
            if (store[1] < m) {
                countYen += store[0] * store[1];
                m -= store[1];
            } else {
                countYen += store[0] * m;
                break;
            }
        }
        System.out.println(countYen);
    }
}