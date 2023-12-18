import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), x = in.nextInt(), y = in.nextInt();

        int ans;
        if(a + b > c * 2) {
            int tmp1 = 0, tmp2 = 0;
            ans = Math.min(x, y) * 2 * c;
            if(x > y) {
                tmp1 = (x - y) * a;
            } else {
                tmp1 = (y - x) * b;
            }
            tmp2 = c * Math.abs(x - y) * 2;
            ans += Math.min(tmp1, tmp2);
        } else {
            ans = a * x + b * y;
        }

        System.out.println(ans);
    }
}