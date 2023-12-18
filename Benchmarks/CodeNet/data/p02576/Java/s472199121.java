import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        //long start = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int t = sc.nextInt();
        sc.close();
        int tmp = n/x;
        if (n%x != 0) ++tmp;
        System.out.println(tmp*t);
//        long end = System.currentTimeMillis();
//        System.err.println((end-start)+"ms");
    }
}