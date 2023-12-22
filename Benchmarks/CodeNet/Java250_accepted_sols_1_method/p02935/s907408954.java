

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
        double sum = a[0];
        for (int i = 1; i < n; i++) {
            sum = (sum + a[i]) / 2;
        }
        System.out.println(sum);
    }
}
