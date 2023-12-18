
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int W = scan.nextInt();
        int H = scan.nextInt();
        String c = scan.next();
        int s = 1;
        int k = 1;

        for (int i = 0; i != H; i++) {
            for (int y = 0; y != W; y++) {
                if (s == 1 && k == 1 || s == 1 && k == H || s == W && k == 1 || s == W && k == H) {
                    System.out.print("+");

                } else if (H - (H / 2) == k && W - (W / 2) == s) {
                    System.out.print(c);

                } else if (k == H || k == 1) {

                    System.out.print("-");
                } else if (s == W || s == 1) {
                    System.out.print("|");

                } else {
                    System.out.print(".");

                }

                s++;

            }
            System.out.println();
            s = 1;
            k++;

        }

    }
}

