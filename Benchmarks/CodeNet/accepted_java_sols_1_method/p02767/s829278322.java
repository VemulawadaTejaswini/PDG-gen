
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int max = 0, min = 100;
        int x[] = new int[n];
        for (int i=0; i < n;i ++) {
            x[i] = scan.nextInt();
            if (x[i] > max) {
                max = x[i];
            }

            if (x[i] < min) {
                min = x[i];
            }
        }

        int minTotal = 99999999;
        for (int i = min; i <= max; i++) {
            int total = 0;
            for (int k = 0; k < n; k++) {
                total += Math.pow((x[k] - i), 2);
            }

            if (total < minTotal) {
                minTotal = total;
            }
        }
        System.out.println(minTotal);
    }
}