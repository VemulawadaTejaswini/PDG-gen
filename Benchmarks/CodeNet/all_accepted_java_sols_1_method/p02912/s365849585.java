import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        scanner.nextLine();
        final int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        final PriorityQueue<Integer> queue = new PriorityQueue<>((x, y) -> y - x);
        for (int i: a) {
            queue.add(i);
        }

        for (int i = 0; i < m; i++) {
            int price = queue.poll();
            queue.add(price / 2);
        }

        long sum = 0;
        while (!queue.isEmpty()) {
            sum += queue.poll();
        }

        System.out.println(sum);
    }
}