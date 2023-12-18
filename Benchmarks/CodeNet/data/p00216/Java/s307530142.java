
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int best = 4280;
        int k = 0;
        int n = 0;
        int w = scan.nextInt();

        while (w != -1) {
            if (w > 30) {
                n += 1150 + 125 * 10 + 140 * 10 + (w - 30) * 160;

            } else if (w > 20 && w <= 30) {
                n = 0;
                n += 1150 + 125 * 10 + (w - 20) * 140;

            } else if (w > 10 && w <= 20) {
                n = 0;
                n += 1150 + (w - 10) * 125;

            } else if (w <= 10) {
                n = 0;
                n += 1150;
            }

            k = best - n;
            System.out.println(k);
            k = 0;
            w = scan.nextInt();
        }
    }
}

