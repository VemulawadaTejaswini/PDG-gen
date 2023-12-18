import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    private static int count = 0;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i=0; i<N; i++) {
            queue.add(scanner.nextInt());
        }
        for (int i=0; i<M; i++) {
            queue.add(queue.poll()>>1);
        }
        System.out.println(queue.stream().mapToLong(x -> x).sum());
    }
}