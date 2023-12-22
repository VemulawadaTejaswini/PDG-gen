import java.util.*;
public class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long cur = 100; int ans = -1;
        for (int i = 0; i <= 4200; i++) {
            if (cur >= x) {
                ans = i; break;
            }
            cur = (long) ((long) cur * 1.01);
        }
        System.out.println(ans);
    }


}