import java.util.Scanner;

public class Main {
    static final int NUMBER = 1000000007;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long sum = 0;
        long[] ai = new long[n];
        for(int i=0; i<n; i++) {
            ai[i] = in.nextLong();
            sum += ai[i];
        }
        long ans = 0;
        for(int i=0; i<n-1; i++) {
            sum -= ai[i];
            long tempSum = sum % NUMBER;
            long toBeAdded = ai[i] * tempSum;
            ans += toBeAdded % NUMBER;
            ans = ans % NUMBER;
        }
        System.out.println(ans);
    }
}
