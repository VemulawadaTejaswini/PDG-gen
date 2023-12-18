import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        long ans;
        if(a >= 2 && b >= 2) ans = (a-2) * (b-2);
        else ans = Math.abs(Math.max(a, b) - 2);
        System.out.println(ans);
    }
}