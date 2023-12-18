import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long d = sc.nextLong();
        long need = d * d;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            if (x * x + y * y <= need) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}