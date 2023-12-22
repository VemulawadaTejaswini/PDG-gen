import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0 ; i < n ; i++) {
            h[i] = sc.nextInt();
        }
        double min = Double.MAX_VALUE;
        int ans = 0;
        for (int i = 0 ; i < n ; i++) {
           if (min > Math.abs(a - (t - 0.006 * h[i]))) {
               ans = i + 1;
               min = Math.abs(a - (t - 0.006 * h[i]));
           }
        }
        System.out.println(ans);
    }

}
