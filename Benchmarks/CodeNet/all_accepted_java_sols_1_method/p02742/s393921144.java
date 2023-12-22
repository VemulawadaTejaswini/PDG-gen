import java.util.*;

public class Main {

    public static void main(String[] args) {
        // input
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long w = sc.nextLong();
        if (h == 1 || w == 1) {
            System.out.println(1);
        } else {
            long ans = h * w / 2;
            if (h * w % 2 == 1) {
                ans++;
            }
            System.out.println(ans);
        }
    }
}