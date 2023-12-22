import java.util.*;
public class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt();
        int k = sc.nextInt(); long ans = 0;
        if (k >= 0) {
            ans += 1 * Math.min(a, k);
            k -= Math.min(a, k);
        }
        if (k >= 0) {
            ans += 0 * Math.min(b, k);
            k -= Math.min(b, k);
        }
        if (k >= 0) {
            ans += -1 * Math.min(c, k);
            k -= Math.min(c, k);
        }
        System.out.println(ans);
    }


}