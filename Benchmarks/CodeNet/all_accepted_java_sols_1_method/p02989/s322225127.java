import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] d = new int[N];
        for (int i = 0; i < N; i++) {
            d[i] = sc.nextInt();
        }

        Arrays.sort(d);

        int center = N / 2;

        System.out.println(d[center] - d[center - 1]);
    }
}
