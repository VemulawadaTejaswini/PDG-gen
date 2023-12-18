//agc033_b
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt(), W = sc.nextInt(), N = sc.nextInt();
        int Sr = sc.nextInt(), Sc = sc.nextInt();
        String S = sc.next(), T = sc.next();
        sc.close();
        int left = 1, right = W, up = 1, down = H;
        boolean alive = true;
        for (int i = N - 1; i >= 0; i--) {
            switch (T.charAt(i)) {
                case 'L': right = Math.min(W, right + 1); break;
                case 'R': left = Math.max(1, left - 1); break;
                case 'U': down = Math.min(H, down + 1); break;
                case 'D': up = Math.max(1, up - 1); break;
            }
            switch (S.charAt(i)) {
                case 'L': left++; break;
                case 'R': right--; break;
                case 'U': up++; break;
                case 'D': down--; break;
            }
            if (left > right || up > down) {
                alive = false;
                break;
            }
        }
        boolean ans = alive && Sr >= up && Sr <= down && Sc >= left && Sc <= right;
        System.out.println(ans ? "YES" :"NO");
    }
}
