import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();

        long ans = 0;
        long now = 100;
        while (true) {
            ans++;
            now *= 1.01;
            if (now >= x) {
                System.out.println(ans);
                return;
            }
        }
    }
}