import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();

        if (l >= 2019) {
            int minus = 2019 * (l / 2019);
            l -= minus;
            r -= minus;
        }

        if (r > 2019) {
            r = 2019;
        }

        int result = 2018;
        for (int i = l; i < r; i++) {
            for (int j = l + 1; j <= r; j++) {
                result = Math.min(result, i * j % 2019);
            }
        }

        System.out.println(result);
    }
}
