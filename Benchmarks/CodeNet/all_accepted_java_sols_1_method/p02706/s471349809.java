import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final int m = sc.nextInt();
        //final int []a = new int[m];
        long sum = 0;
        for (int i =0;i<m;++i) sum += sc.nextInt();

        System.out.println(n-sum >= 0 ? n-sum:-1);
        sc.close();
    }
}