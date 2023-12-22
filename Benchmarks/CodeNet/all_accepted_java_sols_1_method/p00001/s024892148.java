
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int t[] = new int[10];
        t[0] = scan.nextInt();
        t[1] = scan.nextInt();
        t[2] = scan.nextInt();
        t[3] = scan.nextInt();
        t[4] = scan.nextInt();
        t[5] = scan.nextInt();
        t[6] = scan.nextInt();
        t[7] = scan.nextInt();
        t[8] = scan.nextInt();
        t[9] = scan.nextInt();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (t[j] < t[j + 1]) {
                    int temp = t[j];
                    t[j] = t[j + 1];
                    t[j + 1] = temp;
                }

            }

        }
        for (int i = 0; i < 3; i++) {
            System.out.println(t[i]);

        }

    }
}

