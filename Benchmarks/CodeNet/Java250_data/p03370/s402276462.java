import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int n = sc.nextInt();
        final int x = sc.nextInt();

        final int[] m = new int[n];
        int used = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
            used += m[i];
            min = Math.min(min, m[i]);
        }

        System.out.println(m.length + (x - used) / min);
    }
}
