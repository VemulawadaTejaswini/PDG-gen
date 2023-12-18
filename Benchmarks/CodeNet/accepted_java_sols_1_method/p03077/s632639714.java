import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] a = new long[5];
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);
        long min = a[0];
        long ans = (long) (Math.ceil(n / (min + 0.0)) + 4);
        System.out.println(ans);
    }
}