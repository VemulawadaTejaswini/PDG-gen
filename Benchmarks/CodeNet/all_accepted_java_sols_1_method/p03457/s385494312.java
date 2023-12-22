import java.util.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 入力
        int n = sc.nextInt();
        int dt, dx, dy, dif;
        // 初期値
        boolean can = true;
        int t = 0;
        int x = 0;
        int y = 0;

        for (int i = 0; i < n; i++) {
            // 入力値
            dt = sc.nextInt();
            dx = sc.nextInt();
            dy = sc.nextInt();
            dif = Math.abs(dx - x) + Math.abs(dy - y) - dt + t;
            if (dif > 0 || (dif % 2 != 0)) {
                can = false;
            }
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
