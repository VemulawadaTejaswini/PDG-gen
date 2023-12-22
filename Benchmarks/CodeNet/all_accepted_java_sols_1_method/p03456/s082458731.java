import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x;
        if(b >= 100) x = 1000 * a + b;
        else if(b >= 10) x = 100 * a + b; 
        else x = 10 * a + b;
        String ans = "No";
        for(int i = 1; i < 1000; i++)
            if(i * i == x)  ans = "Yes";
        System.out.println(ans);
    }
}