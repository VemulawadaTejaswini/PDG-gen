import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = 0;
        for(int i = 0; i < n; i++) {
            int a = in.nextInt();
            while(0 < a && a % 2 == 0) {
                ans++;
                a /= 2;
            }
        }
        System.out.println(ans);
    }
}
