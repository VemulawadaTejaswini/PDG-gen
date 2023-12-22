import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            long N = in.nextLong();
            long[] n = new long[5];
            for (int i = 0; i < n.length; i++) {
                n[i] = in.nextLong();
            }

            long min = (long) 1e18;
            for (int i = 0; i < n.length; i++) {
                min = Math.min(min, n[i]);
            }

            long res = 4 + N / min + (N % min == 0 ? 0 : 1);

            System.out.println(res);
        }
    }
}
