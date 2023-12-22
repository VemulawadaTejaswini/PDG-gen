import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();
        int n = sc.nextInt();

        int ans = 0;

        for (int i = 0; i < n; i++) {
            ans += Math.pow(100, d);
            if (ans % Math.pow(100, d+1) == 0) {
                ans += Math.pow(100, d);
            }
            //System.out.println(ans);
        }
        //System.out.println("----");
        System.out.println(ans);
    }
}
