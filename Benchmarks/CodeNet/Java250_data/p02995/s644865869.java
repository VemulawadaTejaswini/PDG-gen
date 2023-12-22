import java.util.*;

public class Main
{
    public static long y(long m, long n)
    {
        long tmp;
        while(m%n != 0)
        {
            tmp = n;
            n = m%n;
            m = tmp;
        }
        return n;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long a, b, c, d;
        a = sc.nextLong();
        b = sc.nextLong();
        c = sc.nextLong();
        d = sc.nextLong();
        long count = b - a + (long)1;

        long gcd = y(c,d);
        long lcd = c*d/gcd;
        

        // if(a%c==0 && a%d==0)
        // {
        //     count++;
        // }
        // if(b%c==0 && b%d==0){
        //     count++;
        // }
        long tmp;
        tmp = b/c + b/d - b/lcd - (a-1)/c - (a-1)/d + (a-1)/lcd;
        
            
        count = count - tmp;

        System.out.println(count);
        
        
    }
}

