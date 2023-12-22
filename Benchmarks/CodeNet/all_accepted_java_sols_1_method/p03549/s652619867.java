import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        double total = 0.0;
        int t = 1900 * m + 100 * (n - m);
        double nth = t;
        int i = 0;
        double d = Math.pow(0.5, m);
        while (nth > 0.00000001) {
            i++;
            nth = ((double)t * i) * d;
            total += nth;
            d *= (1 - Math.pow(0.5, m));

        }
        System.out.println(Math.round(total));
    }
}