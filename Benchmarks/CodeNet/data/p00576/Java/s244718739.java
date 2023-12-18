import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();

        int[] x = new int[n];
        for(int i = 0; i < n; i++) {
            x[i] = scan.nextInt();
        }
        scan.nextLine();

        int m = scan.nextInt();
        scan.nextLine();

        // int[] a = new int[m];
        int a;
        for(int j = 0; j < m; j++) {
            // a[j] = scan.nextInt();
            a = scan.nextInt();

            if (a == n) {
                if (x[a - 1] < 2019) {
                    x[a - 1]++;
                }
            } else {
                if (x[a - 1] + 1 < x[a]) {
                    x[a - 1]++;
                }
            }
        }
        scan.nextLine();

        scan.close();

        for (int i = 0; i < n; i++) {
            System.out.println(x[i]);
        }
    }
}
