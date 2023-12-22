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
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a==b && b!=c) System.out.println("Yes");
        else if (a==c && c!=b) System.out.println("Yes");
        else if (b==c && b!=a) System.out.println("Yes");
        else System.out.println("No");

        sc.close();
    }
}