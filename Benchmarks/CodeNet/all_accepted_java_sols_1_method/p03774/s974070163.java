
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[m];
        int[] d = new int[m];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            c[i] = sc.nextInt();
            d[i] = sc.nextInt();
        }
        int min = Math.abs(a[0] - c[0]) + Math.abs(b[0] - d[0]);
        int s = 0;
        for (int i = 0; i < n; i++) {
            min = Integer.MAX_VALUE;
            for (int j = 0; j < m; j++) {
                if (min > Math.abs(a[i] - c[j]) + Math.abs(b[i] - d[j])) {
                    min = Math.abs(a[i] - c[j]) + Math.abs(b[i] - d[j]);
                    s = j;
                }
            }
            System.out.println(s + 1);
        }
    }
}
