import java.util.*;

public class Main {

    public static void main(String[] args) {
        exec();
    }

    static void exec() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        long ans = 0;
        for (int i = 0; i < n; i++) {
            a[i] =sc.nextLong();
        }
        long ho = 1000000007;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                long tmp = a[i] * a[j] % ho;
                ans = (ans + tmp) % ho;
            }
        }
        System.out.println(ans);
    }
}