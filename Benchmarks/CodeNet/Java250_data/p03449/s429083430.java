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
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if (i < j) {
                    sum += b[j];
                } else if (i == j) {
                    sum += a[j];
                    sum += b[j];
                } else {
                    sum += a[j];
                }
            }
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}