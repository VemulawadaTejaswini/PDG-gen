import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int c = 0;
        while(n>0)
        {
            n/=k;
            c++;
        }
        System.out.println(c);
    }
}