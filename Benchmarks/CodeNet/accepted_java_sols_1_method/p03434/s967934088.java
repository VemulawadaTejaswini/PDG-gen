import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();

        final Integer[] a = new Integer[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a, Comparator.reverseOrder());

        int alice = 0;
        int bob = 0;

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) alice += a[i];
            if (i % 2 != 0) bob += a[i];
        }

        System.out.println(alice - bob);
    }
}
