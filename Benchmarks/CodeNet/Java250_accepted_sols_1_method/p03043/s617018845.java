import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final int k = sc.nextInt();

        double sum = 0;
        final double base = 0.5;
        final double base2 = 1/(double)n;
        for (int deme = 1;deme <= n;++deme)
        {
            int nn = 0;
            int s = deme;
            while (s < k)
            {
                s *= 2;
                ++nn;
            }
            sum += base2*Math.pow(base,nn);
        }
        System.out.println(sum);
        sc.close();
    }
}