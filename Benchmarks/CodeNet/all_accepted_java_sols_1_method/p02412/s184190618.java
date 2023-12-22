import java.util.Scanner;

/**
 * How many ways?
 */
public class Main {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        // n までの数,３つの数の合計x
        int n,x = 0;
        int i,j,k = 1;
        while (true) {
            int cnt = 0;
            n = scan.nextInt();
            x = scan.nextInt();
            if (n == 0 && x == 0) {
                return;
            }
            for (i = 1; i <= n; i++) {
                for (j = i; j <= n; j++) {
                    for (k = j; k <= n; k++) {
                        // 重複していないかつ合計が一致
                        if (x == (i + j + k) && !(i == j) && !(j == k) && !(i == k)) {
                            ++ cnt;
                            break;
                        }
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}