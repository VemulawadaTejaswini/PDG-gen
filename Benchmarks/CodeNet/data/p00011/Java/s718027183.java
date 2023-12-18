import java.util.Scanner;

public class Main {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x, y, c;
        String str;

        str = sc.nextLine();
        int w = Integer.parseInt(str);
        int[] a = new int[w];
        for (int i = 0; i < w; i++)
        {
            a[i] = i + 1;
        }

        str = sc.nextLine();
        int n = Integer.parseInt(str);

        for (int i = 0; i < n; i++)
        {
            str = sc.nextLine();
            String[] X = str.split(",", -1);
            x = Integer.parseInt(X[0]);
            y = Integer.parseInt(X[1]);
            c = a[x-1];
            a[x-1] = a[y-1];
            a[y-1] = c;
        }
        sc.close();

        for (int i = 0; i < w; i++) System.out.println(a[i]);
    }
}
