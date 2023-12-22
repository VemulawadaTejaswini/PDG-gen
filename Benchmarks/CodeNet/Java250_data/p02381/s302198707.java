import java.util.Scanner;

public class Main {
    public static void main (String[] args)
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            int i, n, sum;
            double avg, s2;
            double[] s = new double[10000];

            for (i = 0; true; i++)
            {
                n = sc.nextInt();
                if (n == 0) break;
                sum = 0;
                s2 = 0;
                int[] x = new int[n];
                for (int m = 0; m < n; m++)
                {
                    x[m] = sc.nextInt();
                    sum += x[m];
                }
                avg = (double) sum / n;

                for (int m = 0; m < n; m++)
                {
                    s2 += (double) (x[m] - avg) * (x[m] - avg);
                }
                s[i] = Math.sqrt(s2 / n);
            }
            sc.close();

            for (int m = 0; m < i; m++)
            {
                System.out.println(s[m]);
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println(e);
        }
    }
}
