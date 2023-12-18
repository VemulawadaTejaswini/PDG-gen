import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);

        while (true) {
            int n = inScanner.nextInt();

            if (n == 0) {
                break;
            }

            int s = 0;
            int max = 0;
            int min = 1000;
            for (int i = 0; i < n; i++) {
                int si = inScanner.nextInt();

                if (max <= si) {
                    max = si;
                }
                if (min >= si) {
                    min = si;
                }

                s += si;
            }

            s -= (min + max);

            System.out.println(s/(n-2));
        }
    }
}