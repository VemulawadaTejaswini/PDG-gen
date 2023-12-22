import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];

        int l = Integer.MAX_VALUE / 2, r = -1;
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            l = Math.min(l, x[i]);
            r = Math.max(r, x[i]);
        }
        long min = Integer.MAX_VALUE / 2;
        for (int i = l; i <= r; i++) {
            long d = 0;
            for (int j = 0; j < n; j++) {
                d += Math.pow(i - x[j], 2);
            }
            min = Math.min(min, d);
        }
        System.out.println(min);
    }
}