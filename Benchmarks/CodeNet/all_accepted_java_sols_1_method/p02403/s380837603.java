import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        Scanner stdIn = new Scanner(System.in);

        while (true) {
            int a = stdIn.nextInt();
            int b = stdIn.nextInt();
            if (a == 0 && b == 0) {
                break;
            }

            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.printf("#");
                }
                System.out.println();
            }
            System.out.println();
        }


    }
}
