import java.util.Scanner;

public class Main {
    //Balance
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0;
        int[] W = new int[n];
        for (int i = 0; i < n; i++) {
            W[i] = sc.nextInt();
            sum += W[i];
        }
        int sum1 = 0, sum2 = sum, minDiff = Integer.MAX_VALUE;
        for (int w : W) {
            sum1 += w;
            sum2 -= w;
            minDiff = Math.min(minDiff, Math.abs(sum1 - sum2));
        }
        sc.close();
        System.out.println(minDiff);
    }
}
