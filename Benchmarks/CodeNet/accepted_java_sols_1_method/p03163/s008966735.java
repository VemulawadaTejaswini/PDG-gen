import java.util.Scanner;

/**
 * Created by AMK on 8/27/2019.
 * Life is nice :)
 * Enjoy coding :D
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        int items[] = new int[n + 1];
        int weights[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            weights[i] = scanner.nextInt();
            items[i] = scanner.nextInt();
        }
        long memo[][] = new long[n + 1][w + 1];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j <= w; j++) {
                if (j >= weights[i]){
                    memo[i][j] = Math.max(memo[i - 1][j], memo[i - 1][j - weights[i]] + items[i]);
                }else{
                    memo[i][j] = memo[i - 1][j];
                }
            }
//            System.out.println(memo[i][w]);
        }
        System.out.println(memo[n][w]);
    }
}
