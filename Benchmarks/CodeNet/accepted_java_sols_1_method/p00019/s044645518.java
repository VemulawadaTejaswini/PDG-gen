
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        long n = scan.nextInt();
        long a = 0;
        if (n != 1) {

            for (long i = n - 1; i > 0; i--) {
                a = n * i;
                n = a;

            }

            System.out.println(a);

        } else {
            System.out.println(n);
        }
    }
}

