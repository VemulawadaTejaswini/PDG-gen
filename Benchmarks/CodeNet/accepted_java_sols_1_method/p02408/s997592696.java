import java.util.Scanner;

/***
 * 0S1 - 13... 0 - 12 ... + -1
 * 1H1 - 13... 13 - 25 ... + 12
 * 2C1 - 13... 26 - 38 ... + 25
 * 3D1 - 13... 39 - 51 ... + 38
 */

public class Main {
    public static void main(String[] args) {
        boolean[] findedCard = new boolean[52];
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.next());

        for (int i = 0; i < 52; i++) {
            findedCard[i] = false;
        }

        for (int i = 0; i < num; i++) {
            String suit;
            int buf1, buf2;

            suit = scan.next();
            buf1 = Integer.parseInt(scan.next());

            if (suit.equals("S")) {
                buf2  = buf1 - 1;
            } else if (suit.equals("H")) {
                buf2 = buf1 + 12;
            } else if (suit.equals("C")) {
                buf2 = buf1 + 25;
            } else {
                buf2 = buf1 + 38;
            }
            findedCard[buf2] = true;
        }

        for (int i = 0; i < 52; i++) {
            if (!findedCard[i]) {
                int div, mod;
                div = i / 13;
                mod = i % 13 + 1;
                if (div == 0) {
                    System.out.println("S " + mod);
                } else if (div == 1) {
                    System.out.println("H " + mod);
                } else if (div == 2) {
                    System.out.println("C " + mod);
                } else {
                    System.out.println("D " + mod);
                }
            }
        }

    }
}

