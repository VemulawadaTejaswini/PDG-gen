
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int s = scan.nextInt();
        int b = scan.nextInt();

        while (n != 0 && s != 0 && b != 0) {
            int r = 0;
            int f = 0;
            int t[] = new int[n];
            for (int i = 0; i < n; i++) {
                t[i] = scan.nextInt();
            }
            for (int x = s; x <= b; x++) {
                int l = t[x - 1] - t[x];
                if (r <= l) {
                    r = l;
                    f = x;
                }
            }
            System.out.println(f);
            n = scan.nextInt();
            s = scan.nextInt();
            b = scan.nextInt();

        }
    }
}


