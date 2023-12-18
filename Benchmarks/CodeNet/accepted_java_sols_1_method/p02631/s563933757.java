import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        long totalXor = a[0];
        for (int i = 1; i < n; i++) {
            totalXor ^= a[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i] ^ totalXor);
        }
    }

}
