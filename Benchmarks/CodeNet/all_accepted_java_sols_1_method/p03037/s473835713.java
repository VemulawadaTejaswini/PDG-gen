

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] L = new int[m];
        int[] R = new int[m];
        int maxL = 0;
        int minR = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            L[i] = sc.nextInt();
            R[i] = sc.nextInt();
            maxL = Math.max(maxL, L[i]);
            minR = Math.min(minR, R[i]);
        }
        System.out.println(Math.max(minR - maxL + 1, 0));

    }
}
