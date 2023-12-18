import java.math.BigDecimal;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        long[] arr = new long[n];
        long t = 0;

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextLong();
            t ^= arr[i];
        }

//        long[] res = new long[n];
//
//        for (int i=0; i<n-1; i++) {
//            res[i+1] = arr[i];
//        }
//        res[0] = arr[n-1];

        for (int i=0; i<n; i++) System.out.print((arr[i]^t) + " ");

//        System.out.println(t);

//        System.out.print(11 ^ 9 ^ 24);

    }
}
