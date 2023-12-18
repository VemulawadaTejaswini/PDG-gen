import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int ans = 0;
        if (A + B < 2 * C) {
            ans += A * X + B * Y;
        } else {
            ans += Math.min(X, Y) * 2 * C;
            if (X > Y) {
                ans += (X - Y) * Math.min(A, 2 * C);
            } else {
                ans += (Y - X) * Math.min(B, 2 * C);
            }
        }
        System.out.println(ans);
    }
}