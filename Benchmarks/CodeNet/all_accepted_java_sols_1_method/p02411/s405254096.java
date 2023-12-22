import java.util.Scanner;

public class Main {
    public static void main (final String[] args)
    {
        try
        {
            final int[] m = new int[50];
            final int[] f = new int[50];
            final int[] r = new int[50];
            final char[] g = new char[50];

            int i;

            final Scanner sc = new Scanner(System.in);

            for (i = 0; true; i++)
            {
                m[i] = sc.nextInt();
                f[i] = sc.nextInt();
                r[i] = sc.nextInt();

                if (m[i] + f[i] + r[i] == -3) break;
            }
            sc.close();

            final int I = i;

            for (i = 0; i < I; i++)
            {
                if (m[i] == -1 || f[i] == -1) g[i] = 'F';
                else 
                {
                    if (m[i] + f[i] >= 80) g[i] = 'A';
                    else
                    {
                        if (m[i] + f[i] >= 65) g[i] = 'B';
                        else
                        {
                            if (m[i] + f[i] >= 50) g[i] = 'C';
                            else
                            {
                                if (m[i] + f[i] >= 30)
                                {
                                    if (r[i] >= 50) g[i] = 'C';
                                    else g[i] = 'D';
                                } else {
                                    g[i] = 'F';
                                }
                            }
                        }
                    }
                }
            }

            for (i = 0; i < I; i++)
            {
                System.out.println(g[i]);
            }
        }
        catch (final NumberFormatException e)
        {
            System.out.println(e);
        }
    }
}
