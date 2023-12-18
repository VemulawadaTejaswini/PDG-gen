import java.util.*;

public class Main
{
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);

        long n = kb.nextLong();

        long k = 1;
        long ans = 0;
        long sum = 0;
        for(;;k++)
        {
            long target = n * k;
            
            double res = Math.sqrt(8 * target + 1);

            if(res % 1 == 0)
            {
                ans = (int)(res - 1)/2;
                break;
            }
        }
        System.out.println(ans);
    }
}