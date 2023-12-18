import java.util.*;
public class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(); long b = sc.nextLong(); long n = sc.nextLong(); long ans;
        if (n >= b - 1) {
            ans = (a * (b-1))/b - a * ((b-1) / b);
        } else {
            ans = (a * n)/b - a * (n / b);
        }
        System.out.println(ans);
    }


}