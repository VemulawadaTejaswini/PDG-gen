import java.util.Scanner;

public class Main {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        while (true) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            if (x == 0 && y == 0) {
                return;
            }
            for (int i = 0; i < x; i++) {
                for (int p = 0; p < y; p++) {
                    System.out.print("#");
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }
    }
}