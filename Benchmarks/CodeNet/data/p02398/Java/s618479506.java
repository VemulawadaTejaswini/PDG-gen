
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();
        int c = scan.nextInt();
        int k = 0;

        for (int a = x; a <= y; a++) {
            if (c % a == 0) {
                k++;
            }
        }
        System.out.println(k);
    }

}

