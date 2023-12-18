import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextLong();
        }
        long ans = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            if(a[i] == 0) {
                ans += sum / 2;
                sum = 0;
            } else {
                sum += a[i];
            }
        }
        ans += sum / 2;
        System.out.println(ans);
    }
}   