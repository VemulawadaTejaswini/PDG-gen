

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        int ans = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            if (max <= tmp) {
                ans++;
            }
            if (max < tmp) {
                max = tmp;
            }
        }
        System.out.println(ans);
    }
}
