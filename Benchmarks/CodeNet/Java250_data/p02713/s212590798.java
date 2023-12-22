
import java.util.*;
import java.lang.*;
import java.util.stream.*;

public class Main {
    public static int gcd(int a, int b) {
        if(a < b) return gcd(b,a);
        if(b == 0) return a;
        return gcd(b,a%b);
    }

    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer k = Integer.parseInt(scanner.next());

        int ans = 0;
        for(int i = 1; i <= k; i++) {
            for (int j = 1; j <= k; j++) {
                for (int m = 1; m <= k; m++) {
                    ans += gcd(i, gcd(j,m));
                }
            }
        }
        System.out.println(ans);
    }
}
