import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), c= sc.nextInt();
        String ans = (n + m < c)? "No": "Yes";
        System.out.println(ans);
    }
}