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
        long h = sc.nextLong();
        long w = sc.nextLong();

        if (h==1 || w == 1) System.out.println(1);
        else if (h*w%2 == 0) System.out.println(h*w/2);
        else System.out.println(h*w/2+1);
        sc.close();
    }
}