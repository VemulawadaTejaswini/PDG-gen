import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] h = new long[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextLong();
        }
        boolean[] flags = new boolean[n];
        for (int i = 0; i < flags.length; i++) {
            flags[i] = true;
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (h[a-1] < h[b-1]) {
                flags[a-1] = false;
            } else if (h[a-1] > h[b-1]) {
                flags[b-1] = false;
            } else {
                flags[a-1] = false;
                flags[b-1] = false;
            }
        }
        sc.close();

        int count = 0;
        for (int i = 0; i < flags.length; i++) {
            if (flags[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
