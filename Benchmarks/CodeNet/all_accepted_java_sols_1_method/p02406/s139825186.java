import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();

        int x;

        for(int i = 1; i <= a; i++) {
            if (i % 3 == 0) {
                System.out.printf(" %d", i);
            } else {
                x = i;

                do {
                    if (x % 10 == 3) {
                        System.out.printf(" %d", i);
                        break;
                    }
                    x /= 10;
                } while (x != 0);
            }
        }

        System.out.printf("\n");
    }
}

