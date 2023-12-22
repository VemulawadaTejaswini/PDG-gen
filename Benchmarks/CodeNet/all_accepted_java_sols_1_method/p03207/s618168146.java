

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (max < a[i]) {
                max = a[i];
            }
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (max == a[i]) {
                result += a[i] / 2;
                max = -1;
            } else {
                result += a[i];
            }
        }
        System.out.println(result);
    }
}
