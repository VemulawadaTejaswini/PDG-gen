import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int price1;
        int price2;
        if (X > Y) {
            price1 = (C * 2 * Y) + (A * (X - Y));
            price2 = C * 2 * X;
        } else {
            price1 = (C * 2 * X) + (B * (Y - X));
            price2 = C * 2 * Y;
        }
        int price3 = A * X + B * Y;
        int ans = Math.min(price1, price2);
        ans = Math.min(ans, price3);
        System.out.println(+ans);
    }

}