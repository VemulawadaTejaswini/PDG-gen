import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            Queue<Long> aQueue = new PriorityQueue<>(N);
            for (int i = 0; i < N; i++) {
                aQueue.add(sc.nextLong());
            }

            long[][] bcList = new long[M][2];
            for (int i = 0; i < M; i++) {
                bcList[i][0] = sc.nextInt();
                bcList[i][1] = sc.nextLong();
            }

            Arrays.sort(bcList, (a, b) -> Long.compare(a[1], b[1]));

            A: for (int i = bcList.length - 1; i >= 0; i--) {
                long[] bc = bcList[i];
                long b = bc[0];
                long c = bc[1];

                for (int j = 0; j < b; j++) {
                    Long a = aQueue.poll();
                    if (a < c) {
                        aQueue.add(c);
                    } else {
                        aQueue.add(a);
                        break A;
                    }
                }
            }

            System.out.println(aQueue.stream().reduce((current, value) -> current + value).get());
        }
    }

}