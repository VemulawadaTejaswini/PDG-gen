import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), T = sc.nextInt();
        int ans = 1001;
        for (int i = 0; i < n; i++) {
            int c = sc.nextInt(), t = sc.nextInt();
            if (t <= T) ans = Math.min(ans, c);
        }
        System.out.println(ans==1001? "TLE": ans);
    }
}
