import java.util.Scanner;

import static java.lang.Math.max;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] blocks = new int[n];
        int count = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            blocks[i] = sc.nextInt();
        }
        for (int i = 1; i < n; i++) {
            if (blocks[i] <= blocks[i - 1]) {
                count++;
            } else {
                ans = max(count, ans);
                count = 0;
            }
        }
        ans = max(count, ans);

        System.out.println(ans);
    }
}