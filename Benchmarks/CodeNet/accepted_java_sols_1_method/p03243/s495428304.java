import java.net.SecureCacheResponse;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = 0;
        for (int i = n; i <= 999; i++) {
            if (i == 111 || i == 222 || i == 333 || i == 444 || i == 555
            || i == 666 || i == 777 || i == 888 || i == 999) {
                res = i;
                break;
            }
        }

        System.out.println(res);
    }
}
