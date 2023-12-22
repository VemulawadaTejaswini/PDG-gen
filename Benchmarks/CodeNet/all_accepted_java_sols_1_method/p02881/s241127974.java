import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long ans = n - 1;

        for (int i = 0; i < Math.sqrt(n); i++) {
            if (n % (i + 1) == 0) {
                if (ans > (n / (i + 1)) + i - 1) {
                    ans = (n / (i + 1)) + i - 1;
                }
            }
        }

        System.out.println(ans);

        sc.close();

    }

}