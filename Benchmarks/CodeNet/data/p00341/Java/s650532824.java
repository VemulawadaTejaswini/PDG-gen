
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int t[] = new int[12];
        int a = 0;
        int f = 0;

        for (int i = 0; i < 12; i++) {
            t[i] = scan.nextInt();
        }
        for (int c = 0; c < 12; c++) {
            for (int d = 0; d < 12; d++) {
                if (t[c] == t[d]) {
                    a++;
                }
            }
            if (a % 4 == 0) {
                f++;
            }
            a = 0;
        }

        if (f == 12) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}

