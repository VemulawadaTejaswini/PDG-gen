import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt() * 2;
        int x = sc.nextInt();
        int y = sc.nextInt();

        long ans = Long.MAX_VALUE;

        for (int i = 0; i < x + y; i++) {
            long value = c * i + Math.max(0, (x - i) * a) + Math.max(0, (y - i) * b);
            if (value < ans) {
                ans = value;
            }
        }

        System.out.println(ans);
    }
}