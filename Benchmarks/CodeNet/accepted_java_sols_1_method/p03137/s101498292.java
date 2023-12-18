import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n >= m) {
            System.out.println(0);
            return;
        }
        int[] x = new int[m];
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }
        Arrays.sort(x);
        int[] xx = new int[m - 1];
        for (int i = 0; i < xx.length; i++) {
            xx[i] = x[i + 1] - x[i];
        }
        Arrays.sort(xx);
        int ans = 0;
        for (int i = 0; i < m - n; i++) {
            ans += xx[i];
        }
        System.out.println(ans);
    }
}