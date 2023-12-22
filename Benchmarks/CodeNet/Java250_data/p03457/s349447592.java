import java.util.*;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int before_t = 0;
        int t = 0;
        int before_x = 0;
        int x = 0;
        int before_y = 0;
        int y = 0;

        int dt = 0;
        int dxy = 0;
        boolean ans_flg = true;
        for (int i = 0; i < N; i++) {
            t = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();

            dt = t - before_t;
            dxy = Math.abs(x - before_x) + Math.abs(y - before_y);

            if ((dt < dxy) || (dt % 2 != dxy % 2)) {
                ans_flg = false;
                break;
            }

            before_t = t;
            before_x = x;
            before_y = y;
        }
        sc.close();
        System.out.println(ans_flg ? "Yes" : "No");
    }
}