import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String ans = "NO";
        int A = sc.nextInt(), B = sc.nextInt(), X = sc.nextInt();
        if(B >= X - A && X >= A)
             ans = "YES";
        System.out.println(ans);
    }
}