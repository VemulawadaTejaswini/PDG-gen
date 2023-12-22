import java.util.Arrays;
import java.util.Scanner;

/*

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];

        int count = 0;
        boolean flg = false;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            if (a[i] == 0) {
                flg = true;
            }
        }
        if (flg) {
            System.out.println(0);
            return;
        }

        long ans = 1;
        long tmp = 1000000000000000000L;
        long std = 1000000000000000000L;
        for (int i = 0; i < n; i++) {
            ans = ans * a[i];
            tmp = tmp / a[i];
            if (std < ans || ans < 0 || tmp == 0) {
                System.out.println("-1");
                return;
            }
        }

        System.out.println(ans);

    }
}