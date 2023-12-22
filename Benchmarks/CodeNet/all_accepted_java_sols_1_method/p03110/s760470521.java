import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double sum=0;
        while(n-->0)
        {
            double d=sc.nextDouble();
            String s=sc.next();
            if(s.charAt(0)=='J')
                sum+=d;
            else
                sum+=d*380000.0;
        }
        System.out.println(sum);
    }
}