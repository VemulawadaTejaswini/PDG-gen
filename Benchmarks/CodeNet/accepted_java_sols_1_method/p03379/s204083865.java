import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = a[i];
        }
        Arrays.sort(b);
        int s = b[n / 2 - 1];
        int M = b[n / 2];
        for (int i = 0; i < n; i++) {
            if (a[i] <= s) {
                System.out.println(M);
            } else {
                System.out.println(s);
            }
        }
    }
}