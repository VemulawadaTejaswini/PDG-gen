import java.util.stream.IntStream;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt(), ap = 0, cp = 0;
        int[] a = IntStream.concat(IntStream.range(0, n).map(i -> scanner.nextInt()), IntStream.of(1000000001)).sorted().toArray();
        int[] b = IntStream.range(0, n).map(i -> scanner.nextInt()).sorted().toArray();
        int[] c = IntStream.concat(IntStream.range(0, n).map(i -> scanner.nextInt()), IntStream.of(1000000001)).sorted().toArray();
        long ans = 0;
        for (int i = 0; i < n; i++) {
            while (a[ap] < b[i]) ap++;
            while (c[cp] <= b[i]) cp++;
            ans += ap * (long)(n - cp);
        }
        System.out.println(ans);
    }
}