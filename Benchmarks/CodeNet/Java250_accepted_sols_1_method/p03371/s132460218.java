import javax.sql.XAConnection;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        if (A + B < C * 2) {
            System.out.println(X * A + Y * B);
        } else {
            int ans;
            if (X > Y) {
                ans = Y * 2 * C + (X - Y) * A;
            } else {
                ans = X * 2 * C + (Y - X) * B;
            }
            System.out.println(Math.min(ans, Math.max(X, Y) * 2 * C));
        }
    }
}