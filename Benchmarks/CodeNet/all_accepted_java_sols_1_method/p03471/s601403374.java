import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            int[] res = {-1, -1, -1}; // 10000, 5000, 1000
            int n = sc.nextInt();
            int target = sc.nextInt();
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n - i; j++) {
                    int k = n - i - j;
                    int total = 10000 * i + 5000 * j + 1000 * k;
                    if (total == target) {
                        res[0] = i;
                        res[1] = j;
                        res[2] = k;
                    }
                }
            }
            System.out.println(String.format("%d %d %d", res[0], res[1], res[2]));
        }
    }
}