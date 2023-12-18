
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t != 0) {
            int n = scan.nextInt();
            int a = 0;

            for (int i = 0; i < n; i++) {
                int s = scan.nextInt();
                int f = scan.nextInt();
                a += f - s;
            }
            if (a >= t) {
                System.out.println("OK");
            } else {
                System.out.println(t - a);

            }
            t = scan.nextInt();
        }
    }
}

