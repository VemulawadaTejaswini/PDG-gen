import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n;
    static long t;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        t = sc.nextLong();

        long ans = 0;
        int lastTime = 0;
        for (int i = 0; i < n; i++) {
            int time = sc.nextInt();
            ans += Math.min(time - lastTime, t);
            lastTime = time;
        }
        System.out.println(ans+t);
    }
}
