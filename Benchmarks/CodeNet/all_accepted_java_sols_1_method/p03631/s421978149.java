import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String ans ="Yes";
        if(s.charAt(0) != s.charAt(2)) ans = "No";
        System.out.println(ans);
        }
}