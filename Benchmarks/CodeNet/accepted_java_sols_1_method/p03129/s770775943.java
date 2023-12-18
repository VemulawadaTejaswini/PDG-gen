import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String ans = (n + 1 >= 2 * k)? "YES" : "NO";
        System.out.println(ans);
    }
}