import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        Long[] c = new Long[n];
        long bSum = 0;
        for (int i = 0; i <n ; i++) {
            a[i] = sc.nextLong();
            b[i] = sc.nextLong();
            bSum += b[i];
            c[i] = a[i] + b[i];
        }
        Arrays.sort(c, Comparator.reverseOrder());
        long ans = 0;
        for (int i = 0 ; i < n ; i++) {
            if (i % 2 == 0) {
                ans += c[i];
            }

        }
        System.out.println(ans - bSum);
    }

}