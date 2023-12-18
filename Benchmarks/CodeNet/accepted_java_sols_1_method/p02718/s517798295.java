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
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        double fm = 0;
        for (int i=0;i<n;++i)
        {
            int aa = sc.nextInt();
            fm += aa;
            a[i] = aa;
        }
        double kyokai = fm/(4*m);

        for (int i=0;i<n;++i) if (a[i] >= kyokai) ++count;
        System.out.println(count >= m ? "Yes" : "No");
        sc.close();
    }
}