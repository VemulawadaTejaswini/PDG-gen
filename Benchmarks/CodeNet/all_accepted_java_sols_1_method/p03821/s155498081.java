import java.util.Scanner;

/**
 * Created by sonetsuyoshi on 2016/07/31.
 */
public class Main {

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long count = 0;

        long[] a = new long[N];
        long[] b = new long[N];
        for(int i = 0 ; i < N; i++) {
            a[i] = sc.nextLong();
            b[i] = sc.nextLong();
        }

        for(int i = N - 1; i >= 0; i--) {
            long a1 = a[i] + count;
            long b1 = b[i];
            long c = (b1 - (a1 % b1)) % b1;
            count += c;
        }

        System.out.println(count);
    }
}