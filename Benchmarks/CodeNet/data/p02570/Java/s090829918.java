import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        //long start = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int t = sc.nextInt();
        int s = sc.nextInt();

        if (d <= t*s) System.out.println("Yes");
        else System.out.println("No");

        sc.close();

//        long end = System.currentTimeMillis();
//        System.err.println((end-start)+"ms");
    }
}