import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0 ; i < n ; i++) {
            x[i] = sc.nextInt();
        }
        int ans = 10000000;
        for (int i = 0 ; i <= 100 ; i++) {
            int sum = 0;
            for (int j = 0 ; j < n ; j++) {
                sum += (x[j] - i) * (x[j] - i);
            }
            ans = Math.min(ans, sum);
        }
        System.out.println(ans);
    }

}