
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int n = scan.nextInt();
        while (r != 0 || n != 0) {
            for (int s = 0; s < r; s++) {

                for (int i = 0; i < n; i++) {
                    if (s == 0 || s == r - 1 || i == 0 || i == n - 1) {
                        System.out.print("#");
                    } else {
                        System.out.print(".");

                    }
                }
                System.out.println();
            }
            r = scan.nextInt();
            n = scan.nextInt();
            System.out.println();

        }
    }
}

