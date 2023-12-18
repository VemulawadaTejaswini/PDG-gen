import java.io.*;
import java.math.*;
import java.util.*;

class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] cnt = new int[m];

        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            for (int j = 0; j < k; j++) {
                int a = sc.nextInt();
                cnt[a-1]++;
            }
        }

        long res = Arrays.stream(cnt).filter(v -> v == n).count();

        System.out.println(res);

        sc.close();
    }
}