import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int now = 0;
        int ans = 0;
        for (int i = 0; i < N; i++) {
            int h = sc.nextInt();
            if (now < h) {
                ans += h - now;
            }
            now = h;
        }
        System.out.println(ans);
    }
}