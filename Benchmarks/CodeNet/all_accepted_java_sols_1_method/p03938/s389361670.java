import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        int[] a = new int[n+1];
        int[] b = new int[n+1];

        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
            a[i+1] = b[n-i] = 20000*i+1;
        }

        for (int i = 0; i < n; i++) {
            a[p[i]] += i;
            b[p[i]] += i;
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        for (int i = 1; i <= n; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
    }
}
