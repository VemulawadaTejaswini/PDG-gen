import java.util.Scanner;

public class Main {
    static final int MX = 100_000;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long a[] = new long[n];
        long allxor = 0;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            allxor ^= a[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print((allxor ^ a[i]) + " ");
        }
        System.out.println();
    }
}