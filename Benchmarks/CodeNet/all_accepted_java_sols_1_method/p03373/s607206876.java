import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        sc.close();

        int ans1 = 0;
        int ans2 = 0;
        if (A + B - C * 2 <= 0) {
            ans1 = A * X + B * Y;
            ans2 = C * (X + Y);
        } else if (X < Y) {
            ans1 = C * X * 2 + B * (Y - X);
            ans2 = C * Y * 2;
        } else {
            ans1 = C * Y * 2 + A * (X - Y);
            ans2 = C * X * 2;
        }

        System.out.println(Math.min(ans1, ans2));
    }
}
