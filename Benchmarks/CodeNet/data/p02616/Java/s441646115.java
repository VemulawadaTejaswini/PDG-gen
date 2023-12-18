import java.math.*;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();

    int MOD = (int)1e9 + 7;

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt() * (-1);
        Arrays.sort(arr);
        for (int i=0; i<n; i++) arr[i] *= (-1);

        int plus = 0;
        int minus = 0;
        int zero = 0;
        for (int i=0; i<n; i++) {
            if (arr[i] > 0) plus++;
            else if (arr[i] < 0) minus++;
            else zero++;
        }

//        System.out.print(arr[0]);

        if (k <= plus) {
            long res = 1;
            for (int i=0; i<k; i++) {
                res *= (long)arr[i];
                res %= (long)MOD;
            }
            System.out.print(res % (long)MOD);
            return;
        }

        if ( (k-plus) % 2 == 1 ) {
            if (zero > 0) {
                System.out.print(0);
            } else {
                long tmp = 1;
                for (int i=0; i<k; i++) {
                    tmp *= arr[i];
                    tmp += MOD;
                    tmp %= MOD;
                }
                System.out.print(tmp % MOD);
            }
        } else {
            long tmp = 1;
            for (int i=k-1; 0<=i; i--) {
                tmp *= arr[i];
                tmp += MOD;
                tmp %= MOD;
            }
            System.out.print(tmp % MOD);
        }





    }


}

