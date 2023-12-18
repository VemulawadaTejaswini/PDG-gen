import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        //long start = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();

        for (int i = 0;i<k;++i)
        {
            if (a >= b) b *= 2;
            else if (b >= c) c *= 2;
            //else break;
        }

        if (a<b && b < c) System.out.println("Yes");
        else System.out.println("No");

        System.err.println(a+","+b+","+c);
        sc.close();
//        long end = System.currentTimeMillis();
//        System.err.println((end-start)+"ms");
    }
}