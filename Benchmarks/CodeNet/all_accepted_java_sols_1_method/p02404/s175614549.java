
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int h = scanner.nextInt();
            int w = scanner.nextInt();
            if (h == 0 && w == 0) break;
            for (int i = 0; i < w; i++) {
                System.out.print("#");
            }
            System.out.print("\n");
            for (int i = 0; i < h - 2; i++) {
                System.out.print("#");
                for (int j = 0; j < w - 2; j++) {
                    System.out.print(".");
                }
                System.out.print("#");
                System.out.print("\n");
            }
            for (int i = 0; i < w; i++) {
                System.out.print("#");
            }
            System.out.print("\n");
            System.out.print("\n");
        }
        scanner.close();
    }
}

