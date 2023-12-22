import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n];
        for (int i = 0 ; i < n ; i++) {
            v[i] = sc.nextInt();
        }
        Arrays.sort(v);
        double ans = v[0];
        for (int i = 1 ; i < n ; i++) {
            ans = (double) (ans + v[i]) / 2.0;
        }
        System.out.println(ans);
    }

}