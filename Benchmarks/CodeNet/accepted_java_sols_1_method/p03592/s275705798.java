import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i * (m - j) + j * (n - i) == k) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}