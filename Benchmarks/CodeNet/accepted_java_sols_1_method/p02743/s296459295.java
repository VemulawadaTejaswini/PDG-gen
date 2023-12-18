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
        //
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        long d = c - a - b;
        if (d>0 && 4*a*b < d*d) System.out.println("Yes");
        else System.out.println("No");

        sc.close();
    }
}