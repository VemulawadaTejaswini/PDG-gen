import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by AMK on 8/27/2019.
 * Life is nice :)
 * Enjoy coding :D
 */
public class Main {
    static int n;
    private static int arr[];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int k = scanner.nextInt();
        arr = new int[n + 1];
        int memo[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = scanner.nextInt();
        }
        memo[1] = 0;
        memo[2] = Math.abs(arr[2] - arr[1]);
        for (int i = 3; i <= n; i++) {
            int min = Integer.MAX_VALUE;
            int xx = 0;
            for (int j = 1; i - j >= 1 && j <= k; j++) {
                if (memo[i - j] + Math.abs(arr[i] - arr[i - j]) < min){
                    min = memo[i - j] + Math.abs(arr[i] - arr[i - j]);
                    xx = j;
                }
            }
//            System.out.println(i + " " + xx + " " + memo[i - xx] + " " + arr[i] + " " + arr[xx]);
            memo[i] = min;
        }
//        System.out.println(Arrays.toString(memo));
        System.out.println(memo[n]);
    }

}
