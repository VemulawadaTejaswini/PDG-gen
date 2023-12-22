import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int a, b;
            while ((a = scanner.nextInt()) != 0 && (b = scanner.nextInt()) != 0) {
                for (int i = 0; i < a; i++) {
                    for (int j = 0; j < b; j++) {
                        if (i == 0 || i == a - 1 || j == 0 || j == b - 1) {
                            System.out.print("#");
                        } else {
                            System.out.print('.');
                        }
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }
    }
}