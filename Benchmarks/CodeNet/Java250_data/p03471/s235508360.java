import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int y = s.nextInt();
        boolean f = false;
        int i = 0;
        int j = 0;
        int k = 0;
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= (n - i); j++) {
                k = n - i - j;
                if (y == 10000 * i + 5000 * j + 1000 * k) {
                    if (n == i + j + k ) {
                        f = true;
                        break;
                    }
                }
            }
            if (f) {
                break;
            }
        }
        if (f) {
            System.out.println(i + " " + j + " " + k);
        } else {
            System.out.println("-1 -1 -1");
        }
    }
}