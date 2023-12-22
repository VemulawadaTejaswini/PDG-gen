import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i <= Math.max(x, y); ++i) {
            int X = x - i > 0 ? x - i : 0;
            int Y = y - i > 0 ? y - i : 0;
            int tmp = (c * 2) * i + a * X + b * Y;
            ans = Math.min(tmp, ans);
        }
        System.out.println(ans);
    }
}