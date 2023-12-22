
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int a;
            int b;
            int c;
            int d;
            int x = 0;
            for (a = 0; a < 10; a++) {
                for (b = 0; b < 10; b++) {
                    for (c = 0; c < 10; c++) {
                        for (d = 0; d < 10; d++) {
                            if (a + b + c + d == n) {
                                x++;
                            }
                        }
                    }
                }
            }
            System.out.println(x);

        }
    }
}

