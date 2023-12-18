
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int r = 1;
        int n = 1;
        for (int b = 0; b != 9; b++) {

            for (int i = 0; i != 9; i++) {
                System.out.println(r + "x" + n + "=" + r * n);
                n++;
            }
            n = 1;
            r++;
        }

    }

}

