

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] l = new int[m];
        for (int i = 0; i < m; i++) {
            l[i] = sc.nextInt();
        }
        Arrays.sort(l);
        int[] diff = new int[m - 1];
        for (int i = 0; i < m - 1; i++) {
            diff[i] = Math.abs(l[i + 1] - l[i]);
        }
        Arrays.sort(diff);
        int sum = 0;
        for (int i = 0; i < diff.length - n + 1; i++) {
            sum += diff[i];
        }
        System.out.println(sum);
    }
}
