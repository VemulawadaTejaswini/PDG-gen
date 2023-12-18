import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long h = sc.nextLong();

        long ans = 1;
        long a = 1;

        for (int i = 1; i < 10000000; i++) {

            if (ans < h) {
                ans += a * 2;
                a = a * 2;
            } else {
                break;
            }

        }

        System.out.println(ans);

    }
}