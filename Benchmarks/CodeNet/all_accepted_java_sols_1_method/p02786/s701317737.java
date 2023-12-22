
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long count = 1;
        long ans = 0;
        for (int i = 0 ; i < 50 ; i++) {
            if (h > 1) {
                ans += count;
                h /= 2;
                count *= 2;
            } else if (h == 1) {
                h = 0;
                ans += count;
            }
        }
        System.out.println(ans);
    }

}