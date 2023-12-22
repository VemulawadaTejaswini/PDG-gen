

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        int score = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (i % 2 ==1) {
                score += a[i];
            } else {
                score -= a[i];
            }
        }
        System.out.println(Math.abs(score));
    }

}
