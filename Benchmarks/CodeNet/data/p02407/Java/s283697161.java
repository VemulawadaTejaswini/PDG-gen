
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int t[] = new int[n];
        for (int L = 0; L != n; L++) {
            t[L] = scan.nextInt();
        }

        for (int i = n - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(t[i] + " ");
            } else {
                System.out.println(t[i]);

            }
        }
    }
}

