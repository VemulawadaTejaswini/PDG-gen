import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[3 * n];
        for (int i = 0 ; i < 3 * n ; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        long ans = 0;
        for (int i = 0 ; i < n ; i++) {
            ans += (long) a[i * 2 + n];
        }
        System.out.println(ans);
    }

}