
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        while ((n = scan.nextInt()) != 0) {
            int t[] = new int[n];

            for (int i = 0; i < n; i++) {
                t[i] = scan.nextInt();
            }

            int best = -100000000;

            for (int l = 0; l < n; l++) {
                int sum = 0;
                for (int r = l; r < n; r++) {
                    sum += t[r];
                    if (best < sum) {
                        best = sum;
                    }
                }
            }

            System.out.println(best);

        }
    }
}

