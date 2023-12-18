import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double dMax = Double.MIN_VALUE;
        double dMin = Double.MAX_VALUE;
        //StringBuilder answer=new StringBuilder();
        //input
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1;i < (n+1)/2;++i)
        {
            int a = n-i;
            if (n!=a) ++count;
        }
        System.out.println(count);
        sc.close();
    }
}