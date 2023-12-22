import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();
        //        for (long i = 0; i < k; i++) {
        //            if (a >= 1) {
        //                a--;
        //            } else if (b >= 1) {
        //                b--;
        //            } else {
        //                break;
        //            }
        //        }
        if (a <= k) {
            b = a + b - k;
            a = 0;

        } else {
            a = a - k;
        }

        if (b < 0) {
            b = 0;
        }

        System.out.println(a + " " + b);

    }

}
