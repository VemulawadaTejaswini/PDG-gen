import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = std.nextInt();
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(n);
        for (int i = 0; i < n; i++) {
            pq.add(d[i]);
        }

        int divCount = n / 2;

        int value = 0;
        for (int i = 0; i < divCount; i++) {
            value = pq.poll();
        }

        int nextValue = pq.poll();

        int totalCount = nextValue - value;
        System.out.println(totalCount);
    }
}
