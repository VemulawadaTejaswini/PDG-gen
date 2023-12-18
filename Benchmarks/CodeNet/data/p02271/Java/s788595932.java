import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] sums = new int[(int) Math.pow(2,n)];
        for (int j = 0; j < Math.pow(2,n); j++) {
            int sum = 0;
            for (int k = 0; k < n; k++) {

                if ((j >> k & 1) == 1) {
                    sum += a[k];
                }
            }
            sums[j] = sum;
        }
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int m = scanner.nextInt();
            boolean flag = false;
            LOOP: for (int j = 0; j < Math.pow(2,n); j++) {
                if (sums[j] == m) {
                    flag = true;
                    System.out.println("yes");
                    break LOOP;
                }
            }
            if (!flag) System.out.println("no");
        }
    }
}

