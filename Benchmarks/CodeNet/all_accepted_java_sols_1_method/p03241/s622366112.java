import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = 0;
        for (int i = 1; i * i <= m; i++) {
            if (m % i == 0) {
                if (m / i <= m / n) {
                    ans = Math.max(ans, m / i);
                } else if (i <= m / n) {
                    ans = Math.max(ans, i);
                } else {
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}