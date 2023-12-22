

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            for (int j = 0; j < k; j++) {
                int num = sc.nextInt();
                arr[num - 1]++;
            }
        }
        int ans = 0;
        for (int i = 0; i < m; i++) {
            if (arr[i] == n) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
