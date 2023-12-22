import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();

        int[] a = new int[N];
        for (int i = 0; i < N; i++) a[i] = Integer.parseInt(sc.next());

        int[] b = new int[N];
        int p = 1;
        for (int i = 0; i < N; i++) {
            if (a[i] == p) {
                p++;
            } else {
                b[i] = 1;
            }
        }

        if (p == 1) {
            System.out.println(-1);
        } else {
            System.out.println(IntStream.of(b).filter(i -> i == 1).count());
        }
    }
}
