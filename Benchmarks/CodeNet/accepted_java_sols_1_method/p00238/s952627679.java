
import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n;
        int s;
        int f;
        int i;
        int k;
        int m;
        while (t != 0) {
            n = sc.nextInt();
            m = 0;
            for (i = 0; i < n; i++) {
                s = sc.nextInt();
                f = sc.nextInt();
                k = f - s;
                m += k;
            }
            if (m >= t) {
                System.out.println("OK");
            } else if (m < t) {
                System.out.println(t - m);

            }
            t = sc.nextInt();

        }
    }
}

