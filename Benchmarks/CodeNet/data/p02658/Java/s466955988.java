import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long a[] = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        Arrays.sort(a);

        final long aMax = (long) Math.pow(10, 18);

        if (a[0] == 0) {
            System.out.println(0);
            return;
        }

        long result = 1;
        for (long l : a) {
            System.out.println(result + ",  " + aMax / l);
            if (result > aMax / l) {
                System.out.println(-1);
                return;
            }
            result *= l;
        }
        System.out.println(result);

    }
}