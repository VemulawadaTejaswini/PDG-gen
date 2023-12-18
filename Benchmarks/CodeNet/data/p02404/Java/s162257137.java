import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int y = scanner.nextInt(), x = scanner.nextInt();

            if (x == 0 && y == 0) break;

            for (int i = 0; i < y; ++i) {
                for (int j = 0; j < x; ++j) {
                    if (i == 0 || i == y - 1 || j == 0 || j == x - 1) System.out.print("#");
                    else System.out.print(".");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
