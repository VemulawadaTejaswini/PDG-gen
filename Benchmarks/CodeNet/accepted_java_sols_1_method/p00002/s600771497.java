
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int sum = (a + b);
            int c = 0;

            do {
                sum /= 10;
                c++;

            } while (sum > 0);
            System.out.println(c);

        }

    }
}

