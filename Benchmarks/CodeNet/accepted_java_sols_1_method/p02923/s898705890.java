
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 0;
        int streak = -1;
        int prev = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (prev >= num)
                streak++;
            else
                streak = 0;
            if (streak > ans)
                ans = streak;
            prev = num;
        }

        System.out.println(ans);
    }
}