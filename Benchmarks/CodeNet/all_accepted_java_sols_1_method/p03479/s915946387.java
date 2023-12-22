import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();
        long y = sc.nextLong();

        long ans = 1;

        long now = x;

        while (true) {
            now *= 2;
            if (now <= y) {
                ans++;
            } else {
                break;
            }
        }

        System.out.println(ans);
    }
}