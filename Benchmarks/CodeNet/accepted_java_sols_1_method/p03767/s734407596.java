import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        long[] a = new long[N * 3];
        for (int i = 0; i < N * 3; i++) {
            a[i] = cin.nextLong();
        }

        Arrays.sort(a);

        long sum = 0;
        for (int i = N; i < N * 3; i += 2) {
            sum += a[i];
        }

        System.out.println(sum);
    }
}
