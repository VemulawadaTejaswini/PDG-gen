import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int n = sc.nextInt();
        final int x = sc.nextInt();

        final int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
        }

        final int used = IntStream.of(m).sum();
        final int min = IntStream.of(m).min().getAsInt();
        final int ans = m.length + (x - used) / min;

        System.out.println(ans);
    }
}
