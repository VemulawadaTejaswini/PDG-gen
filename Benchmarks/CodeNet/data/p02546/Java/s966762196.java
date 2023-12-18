import java.util.*;
import java.lang.*;
public class sol
{
    public static void main(String[] a)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        if(s.charAt(n-1) == 's')
           {
             s = s+"es";
           }
         else
           {
             s = s+"s";
           }
         System.out.println(s);
    }
}