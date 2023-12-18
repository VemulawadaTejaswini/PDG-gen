import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    private static int[][] area;
    private static int[] linesRows = new int[2];
    private static int[][] around = { { -1, -1 }, { -1, 0 }, { -1, 1 },
                                      { 0, -1 }, { 0, 1 },
                                      { 1, -1 }, { 1, 0 }, { 1, 1 } };

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        while ((linesRows[1] = scanner.nextInt()) != 0) {
            linesRows[0] = scanner.nextInt();
            area = IntStream.range(0, linesRows[0])
                .mapToObj(l -> IntStream.range(0, linesRows[1])
                          .map(r -> scanner.nextInt())
                          .toArray())
                .toArray(int[][]::new);
            System.out.println(solve());
        }
    }
    private static long solve() {
        return IntStream.range(0, linesRows[0] * linesRows[1])
            .filter(n -> area[n / linesRows[1]][n % linesRows[1]] == 1)
            .filter(Main::traceIsland)
            .count();
    }
    private static boolean traceIsland(int n) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(n);
        while (!queue.isEmpty()) {
            int s = queue.poll();
            if (area[s / linesRows[1]][s % linesRows[1]] == 1) {
                area[s / linesRows[1]][s % linesRows[1]] = 2;
                Arrays.stream(around)
                    .filter(a -> s % linesRows[1] + a[1] >= 0)
                    .filter(a -> s % linesRows[1] + a[1] < area[0].length)
                    .filter(a -> s / linesRows[1] + a[0] >= 0)
                    .filter(a -> s / linesRows[1] + a[0] < area.length)
                    .filter(a -> area[s / linesRows[1] + a[0]][s % linesRows[1] + a[1]] == 1)
                    .forEach(a -> queue.offer((s / linesRows[1] + a[0]) * linesRows[1] + (s % linesRows[1] + a[1])));
            }
        }
        return true;
    }
}

