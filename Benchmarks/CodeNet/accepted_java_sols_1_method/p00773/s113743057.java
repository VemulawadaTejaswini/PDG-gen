
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();
        int s = scan.nextInt();
        while (x != 0 && y != 0 && s != 0) {
            int best = 0;
            for (int i = 1; i <= s; i++) {
                for (int t = 1; t <= s; t++) {
                    if (s == i * (x + 100) / 100 + t * (100 + x) / 100) {
                        int g = i * (y + 100) / 100 + t * (100 + y) / 100;
                        if (best < g) {
                            best = g;
                        }

                    }

                }
            }
            System.out.println(best);
            x = scan.nextInt();
            y = scan.nextInt();
            s = scan.nextInt();

        }
    }
}

