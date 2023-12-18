
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int t[] = new int[5];
        for (int i = 0; i < 5; i++) {
            t[i] = scan.nextInt();
        }
        for (int j = 0; j < 4; j++) {
            for (int a = 0; a < 4 - j; a++) {
                if (t[a] < t[a + 1]) {
                    int b = t[a];
                    t[a] = t[a + 1];
                    t[a + 1] = b;
                }
            }

        }
        for (int i = 0; i < 5; i++) {
            if (i < 4) {
                System.out.print(t[i] + " ");
            } else {
                System.out.println(t[i]);
            }
        }

    }
}


