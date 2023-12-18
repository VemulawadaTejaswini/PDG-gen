import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(), b = sc.next();
        if(a.charAt(0) == b.charAt(2) && a.charAt(2) == b.charAt(0)
        && a.charAt(1) == b.charAt(1))
            System.out.print("YES");
        else System.out.print("NO");
    }
}