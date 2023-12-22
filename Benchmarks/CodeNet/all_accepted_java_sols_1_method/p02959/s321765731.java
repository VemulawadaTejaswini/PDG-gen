import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        for(int i = 0 ; i < n + 1; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        for(int i = 0 ; i < n; i++) {
            b[i] = sc.nextInt();
        }
        long c = 0;
        for(int i = 0 ; i < n; i++) {
            int k0 = Integer.min(a[i], b[i]);
            c += k0;
            a[i] -= k0;
            b[i] -= k0;
            int k1 = Integer.min(a[i + 1], b[i]);
            c += k1;
            a[i + 1] -= k1;
            b[i] -= k1;
        }
        System.out.println(c);
    }
}
