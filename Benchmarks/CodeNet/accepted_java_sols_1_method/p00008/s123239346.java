
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
            int n = scan.nextInt();
            int x = 0;

            for (int a = 0; a <= 9; a++) {
                for (int b = 0; b <= 9; b++) {
                    for (int c = 0; c <= 9; c++) {
                        for (int d = 0; d <= 9; d++) {
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

