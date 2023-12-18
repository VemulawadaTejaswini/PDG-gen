import java.net.SecureCacheResponse;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean ans = !(a > 8 || b > 8);

        System.out.println(ans ? "Yay!" : ":(");
    }
}
