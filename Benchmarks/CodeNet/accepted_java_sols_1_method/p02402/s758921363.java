
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int y;
        int b = -1000000;

        int s = 1000000;
        long sum = 0;

        for (int x = 0; x != n; x++) {
            y = scan.nextInt();
            sum = sum + y;

            if (y >= b) {
                b = y;
            }
            if (y <= s) {
                s = y;
            }

        }

        System.out.print(s + " ");
        System.out.print(b + " ");
        System.out.println(sum);
    }

}

