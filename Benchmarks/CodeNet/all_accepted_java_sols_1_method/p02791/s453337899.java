

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = n+1;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            min = Math.min(min, p);
            if (p <= min) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
