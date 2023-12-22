import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 入力
        int n = sc.nextInt();
        // 初期値
        boolean can = true;
        int t, x, y, dt, dx, dy, dif;
        t = x = y = 0;

        for (int i = 0; i < n; i++) {
            // 入力値
            dt = sc.nextInt();
            dx = sc.nextInt();
            dy = sc.nextInt();
            dif = dt - t - Math.abs(dx - x) - Math.abs(dy - y);
            can &= dif >= 0 && dif % 2 == 0;
            t = dt;
            x = dx;
            y = dy;
        }

        // 出力
        if (can) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
