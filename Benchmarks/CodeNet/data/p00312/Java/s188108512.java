
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int D = scan.nextInt();
        int L = scan.nextInt();
        if (D % L == 0) {
            System.out.println(D / L);

        } else {
            System.out.println(D / L + D % L);
        }

    }

}

