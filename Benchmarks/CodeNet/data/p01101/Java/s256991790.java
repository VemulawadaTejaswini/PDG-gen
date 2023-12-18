
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int t;

        while (n != 0 && m != 0) {
            int f = 0;
            int best = 0;
            int k = 0;
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            for (int l = 0; l < n; l++) {
                for (int r = l+1; r < n; r++) {
                    t = a[l] + a[r];
                    if (t <= m) {
                        if (t >= k) {
                            best = t;
                            k = t;
                            f++;
                        }
                    }
                }
            }
            if (f > 0) {
                System.out.println(best);
            } else {
                System.out.println("NONE");
            }
            n = scan.nextInt();
            m = scan.nextInt();

        }
    }
}

