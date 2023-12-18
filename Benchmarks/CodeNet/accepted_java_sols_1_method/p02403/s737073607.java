
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int W = scan.nextInt();
        while (W != 0 && H != 0) {
            for (int s = 0; s != H; s++) {

                for (int i = 0; i != W; i++) {
                    System.out.print("#");
                }
                System.out.println();

            }
            H = scan.nextInt();
            W = scan.nextInt();
            System.out.println();

        }
    }
}

