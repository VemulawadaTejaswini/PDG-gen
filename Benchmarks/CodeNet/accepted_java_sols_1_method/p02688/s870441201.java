import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int n = sc.nextInt();
        final int k = sc.nextInt();
        final int[] snuke = new int[n];
        for (int i = 0; i < k; i++) {
            final int d = sc.nextInt();
            for (int j = 0; j < d; j++) {
                final int a = sc.nextInt();
                snuke[a-1]++;
            }
        }

        System.out.println(IntStream.of(snuke).filter(i -> i == 0).count());
    }
}
