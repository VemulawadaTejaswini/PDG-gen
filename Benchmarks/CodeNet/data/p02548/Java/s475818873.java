import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long ans = 0L;
        for (long a = 1; a < n; a++) {
            ans += (n - 1) / a;
        }
        System.out.println(ans);
    }
}
