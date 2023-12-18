
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int s = scan.nextInt();

        while (x != 0 || y != 0 || s != 0) {

            int komi;
            int komi2;
            int max = 0;

            int goukei;
            for (int i = 1; i <= 1000; i++) {
                for (int g = 1; g <= 1000; g++) {
                    goukei = i * (100 + x) / 100 + g * (100 + x) / 100;
                    if (goukei == s) {

                        komi = (i * (100 + y) / 100) + (g * (100 + y) / 100);

                        if (komi > max) {
                            max = komi;
                        }
                    }
                }
            }
            System.out.println(max);

            x = scan.nextInt();
            y = scan.nextInt();
            s = scan.nextInt();

        }
    }

}

