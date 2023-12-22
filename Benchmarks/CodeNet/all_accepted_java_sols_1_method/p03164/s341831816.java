import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static long MAX = 100000000000L;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] w = new long[n];
        int[] v = new int[n];
        int totalValue = 0;
        for(int i = 0; i < n; i++) {
            w[i] = sc.nextLong();
            v[i] = sc.nextInt();
            totalValue += v[i];
        }
        ArrayList<Long> dp = new ArrayList<>(Collections.nCopies(totalValue + 1, MAX));
        dp.set(0, 0L);
        int maxValue = 0;
        for(int i = 0; i < n; i++) {
            for(int value = totalValue - v[i]; value >= 0; value--) {
                dp.set(value + v[i], Math.min(dp.get(value + v[i]), w[i] + dp.get(value)));
            }
        }
        for(int i = 0; i <= totalValue; i++) {
            if(dp.get(i) <= k) {
                maxValue = i;
            }
        }
        System.out.println(maxValue);

    }
}
