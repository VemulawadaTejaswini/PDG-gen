import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    private static int[][] KUMIAWASE = new int[10][3];
    static {
        KUMIAWASE[0] = new int[] {0, 1};
        KUMIAWASE[1] = new int[] {0, 1, 2};
        KUMIAWASE[2] = new int[] {1, 2, 3};
        KUMIAWASE[3] = new int[] {2, 3, 4};
        KUMIAWASE[4] = new int[] {3, 4, 5};
        KUMIAWASE[5] = new int[] {4, 5, 6};
        KUMIAWASE[6] = new int[] {5, 6, 7};
        KUMIAWASE[7] = new int[] {6, 7, 8};
        KUMIAWASE[8] = new int[] {7, 8, 9};
        KUMIAWASE[9] = new int[] {8, 9};
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();

        Queue<Long> queue = new ArrayDeque<>();
        queue.add(1L);
        queue.add(2L);
        queue.add(3L);
        queue.add(4L);
        queue.add(5L);
        queue.add(6L);
        queue.add(7L);
        queue.add(8L);
        queue.add(9L);

        for (long i = 1; i <= K; i++) {
            long poll = queue.poll();
            if (i == K) {
                System.out.println(poll);
                return;
            }
            int value = (int) (poll % 10);
            for (int j : KUMIAWASE[value]) {
                queue.add(poll * 10 + (long)j);
            }
        }
    }
}