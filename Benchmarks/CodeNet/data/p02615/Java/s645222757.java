import java.math.*;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        long[] arr = new long[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextLong() * (-1L);
        Arrays.sort(arr);
        for (int i=0; i<n; i++) arr[i] *= (-1);

//        System.out.print(arr[0]);

        long res = 0;
        res += arr[0];
        n -= 1;

        if (n % 2 == 1) {
            int tmp = n / 2;
            for (int i=0; i<tmp; i++) {
                res += arr[i+1] * 2;
            }
            System.out.print(res);
        } else {
            int tmp = n / 2 - 1;
            int j = 1;
            for (int i=0; i<tmp; i++) {
                res += arr[i+1] * 2;
                j++;
            }
            res += arr[j];
            System.out.print(res);
        }
    }


}

