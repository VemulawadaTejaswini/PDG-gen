import java.net.SecureCacheResponse;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int ans = Math.max(
                (x*10) + y + z,
                Math.max(
                        x + (y * 10) + z,
                        x + y + (z * 10)
                )
        );

        System.out.println(ans);
    }
}
