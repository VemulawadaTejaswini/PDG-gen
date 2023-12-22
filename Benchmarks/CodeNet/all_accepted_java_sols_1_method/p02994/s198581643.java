import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int L = sc.nextInt();

        int sum = 0;
        int[] apples = new int[N];
        for (int i = 0; i < N; i++) {
            apples[i] = L + i;
            sum += apples[i];
        }

        Arrays.sort(apples);

        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < N; i++) {
            int abs = Math.abs(apples[i]);

            if (min > abs) {
                min = abs;
                index = i;
            } else {
                break;
            }
        }

        System.out.println(sum - apples[index]);
    }

}
