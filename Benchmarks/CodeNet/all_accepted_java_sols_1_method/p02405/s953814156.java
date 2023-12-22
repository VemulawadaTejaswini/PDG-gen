
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int W = scan.nextInt();
        while (H != 0 || W != 0) {
            for (int x = 1; x <= H; x++) {
                for (int y = 1; y <= W; y++) {
                    if (x % 2 == 1 && y % 2 == 0 || x % 2 == 0 && y % 2 == 1) {
                        System.out.print(".");

                    } else {
                        System.out.print("#");
                    }
                }
                System.out.println("");
            }
            System.out.println("");

            H = scan.nextInt();
            W = scan.nextInt();

        }
    }
}

