import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        sc.close();

        if (X == 2) {
            System.out.println(X);
            return;
        }
        int ans = X;
        for (int x = X; x < X * 2; x++) {
            if (x % 2 == 0) continue;
            int sqrt = (int) Math.sqrt(x);
            boolean s = false;
            for (int j = 3; !s && j <= sqrt; j += 2) {
                if (x % j == 0) s = true;
            }
            if (!s) {
                ans = x;
                break;
            }
        }

        System.out.println(ans);
    }
}