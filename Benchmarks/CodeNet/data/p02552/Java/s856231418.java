import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        //long start = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n==1) System.out.println(0);
        else if (n==0) System.out.println(1);
        sc.close();
//        long end = System.currentTimeMillis();
//        System.err.println((end-start)+"ms");
    }
}