import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        int max = 0;
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += a[i];
            int tmp = total;
            for (int j = n-1; j >= i; j--) {
                tmp += b[j];
            }
            max = Math.max(max, tmp);
        }

        System.out.println(max);
    }
}
