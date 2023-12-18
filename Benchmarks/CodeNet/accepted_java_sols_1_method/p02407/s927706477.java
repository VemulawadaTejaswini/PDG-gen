import java.util.Scanner;

public class Main {
    public static void main (String[] args)
    {
        int i, I = 1;
        String s;
        Scanner sc = new Scanner(System.in);

        s = sc.nextLine();
        I = Integer.parseInt(s);
        int[] a = new int[I];

        for (i = 0; i < I; i++)
        {
            s = sc.next();
            a[i] = Integer.parseInt(s);
        }
        sc.close();

        for (i = I - 1; i > 0; i--)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println(a[0]);
    }
}
