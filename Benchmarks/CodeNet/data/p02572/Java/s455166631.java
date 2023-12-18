import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] ar = new long[N];
        for (int i = 0; i < N; i++) {
            ar[i] = sc.nextLong();
        }
        long ans = 0;
        for (int i = 0; i < N-1; i++) {
            for (int j = i+1; j < N; j++) {
                ans += ar[i]*ar[j];
                ans = ans%1000000007;
            }
        }
        System.out.println(ans);
    }
}
