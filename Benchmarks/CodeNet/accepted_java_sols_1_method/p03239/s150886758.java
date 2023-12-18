

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        int t = sc.nextInt();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int ci = sc.nextInt();
            int ti = sc.nextInt();
            if (ti > t) {
                continue;
            }
            if (ci < min) {
                min = ci;
            }
        }

        System.out.println(min == Integer.MAX_VALUE ? "TLE" : min);
    }
}
