
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int t[] = new int[n];

        for (int x = 0; x != n; x++) {
            t[x] = scan.nextInt();
        }

        for (int i = n - 1; i >= 0; i--) {
            if (i != 0) {

                System.out.print(t[i] + " ");
            } else {
                System.out.println(t[i]);

            }
        }
    }
}

