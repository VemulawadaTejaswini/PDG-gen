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
                    System.out.print("#");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
