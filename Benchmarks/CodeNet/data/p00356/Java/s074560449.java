
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        int A = a;
        int B = b;
        while (A % B != 0) {
            int Z = A;
            A = B;
            B = Z % A;

        }
        System.out.println((a + b + 1) - B);

    }

}

