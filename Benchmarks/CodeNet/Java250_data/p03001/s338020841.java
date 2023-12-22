import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //final int n = sc.nextInt();
        final double w = sc.nextDouble();
        final double h = sc.nextDouble();
        final double x = sc.nextDouble();
        final double y = sc.nextDouble();

        final double ansArea = (w*h)/2;
        int ansPattern = 0;
        if (x*2 == w && y*2 == h) ansPattern = 1;
        System.out.println(ansArea+" "+ansPattern);

        sc.close();
    }
}