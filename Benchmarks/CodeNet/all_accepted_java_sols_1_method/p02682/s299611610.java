
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int k = scn.nextInt();
        int ans = 0;
        for (int i = 0; i < a; i++) {
            ans++;
            k--;
            if (k <= 0) {
                System.out.println(ans);
                return;
            }
        }
        for (int i = 0; i < b; i++) {
            k--;
            if (k <= 0) {
                System.out.println(ans);
                return;
            }
        }
        for (int i = 0; i < c; i++) {
            ans--;
            k--;
            if (k <= 0) {
                System.out.println(ans);
                return;
            }
        }
        System.out.println(ans);
    }
}
