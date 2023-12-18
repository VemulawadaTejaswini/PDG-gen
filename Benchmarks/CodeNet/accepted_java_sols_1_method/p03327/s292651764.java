import java.util.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();

        String ans = (a < 1000) ? "ABC" : "ABD";

        System.out.println(ans);
    }
}