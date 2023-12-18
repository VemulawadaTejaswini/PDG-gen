import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner stdIn = new Scanner(System.in);

        int R = 0;

        do {
            R = stdIn.nextInt();
        } while (R < 0 || 4208 < R);

        if (R < 1200) {
            System.out.println("ABC");
        }

        else if (1200 <= R && R < 2800) {
            System.out.println("ARC");
        }

        else if (2800 <= R) {
            System.out.println("AGC");
        }
    }
}