import java.util.Scanner;

public class Main {
    public static void main (String[] args)
    {
        int h, w, i;
        String[] sh = new String[1000];
        String[] sw = new String[1000];
        Scanner sc = new Scanner(System.in);

        try
        {
            for (i = 0; true; i++)
            {
                sh[i] = sc.next();
                sw[i] = sc.next();
                if (sw[i].equals("0") && sh[i].equals("0")) break;
            }

            sc.close();

            int I = i;

            for (i = 0; i < I; i++)
            {
                h = Integer.parseInt(sh[i]);
                w = Integer.parseInt(sw[i]);

                for (int j = 1; j <= h; j++)
                {
                    for (int k = 1; k <= w; k++)
                    {
                        System.out.print("#");
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println(e);
        }
    }
}
