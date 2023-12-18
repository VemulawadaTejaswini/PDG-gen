
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int H = scan.nextInt();
        int k = scan.nextInt();
        int K = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        if (a * h + b * H + (h / 10) * c + (H / 20) * d > a * k + b * K + (k / 10) * c + (K / 20) * d) {
            System.out.println("hiroshi");

        } else if (a * h + b * H + (h / 10) * c + (H / 20) * d < a * k + b * K + (k / 10) * c + (K / 20) * d) {
            System.out.println("kenjiro");

        } else {
            System.out.println("even");
        }

    }
}

