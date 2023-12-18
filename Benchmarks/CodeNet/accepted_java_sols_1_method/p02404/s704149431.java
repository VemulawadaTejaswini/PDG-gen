
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int n = scan.nextInt();

        while (n != 0 || r != 0) {
            for (int i = 0; i < r; i++) {
                for (int t = 0; t < n; t++) {
                    if (i == 0 || i == r - 1 || t == 0 || t == n - 1) {
                        System.out.print("#");
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.println("");
            }
            System.out.println("");
            r = scan.nextInt();
            n = scan.nextInt();
        }

    }
}

