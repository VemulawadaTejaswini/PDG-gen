
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int d[] = new int[N];

        for (int i = 0; i < N; i++) {
            d[i] = scan.nextInt();
        }

        boolean yes = true;

        int maxX = 0;
        for (int i = 0; i < N; i++) {
            int x = 10 * i;

            if (x > maxX) {
                yes = false;
            }

            int hikyori = x + d[i];

            if (hikyori > maxX) {
                maxX = hikyori;
            }
        }

        maxX = 0;
        for (int i = 0; i < N; i++) {
            int x = 10 * i;

            if (x > maxX) {
                yes = false;
            }

            int hikyori = x + d[N - 1 -i];

            if (hikyori > maxX) {
                maxX = hikyori;
            }
        }

        if (yes) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

}

