import java.util.Scanner;

/**
 * Created by Santa on 2016/10/16.
 */
public class Main {

    static int N;
    static long A;
    static long B;
    static long C;
    static int[] map;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        A = scanner.nextInt();
        B =scanner.nextInt();
        C = scanner.nextInt();
        long X = scanner.nextInt();
        long Y  =scanner.nextInt();
        long cost;
        long ans = 1938470973;

        for (int i = 0; i <= 2*(X + Y); i++) {
            long x = X - i;
            long y = Y - i;
            cost = C * 2 * i;

            cost += Math.max(x, 0) * A;
            cost += Math.max(y, 0) * B;
            ans = Math.min(ans, cost);
        }

        System.out.println(ans);

    }
}

