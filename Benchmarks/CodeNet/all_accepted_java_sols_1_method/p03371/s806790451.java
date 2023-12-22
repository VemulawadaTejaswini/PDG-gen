import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] a = { 0, 0, 0, 0, 0 };
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            for (int i = 0; i < a.length; i++) {
                a[i] = scan.nextInt();
            }
        }
        int sum = 0;

        if (a[0] + a[1] <= a[2] * 2) {
            sum = a[0] * a[3] + a[1] * a[4];
        } else {
            if (a[3] >= a[4]) {
                sum = a[4] * 2 * a[2];
                sum = sum + (a[3] - a[4]) * a[0];
            } else {
                sum = a[3] * 2 * a[2];
                sum = sum + (a[4] - a[3]) * a[1];
            }

        }
        int sum1 = 0;
        if (a[3] >= a[4]) {
            sum1 = a[3] * a[2] * 2;
        }
        if (a[3] < a[4]) {
            sum1 = a[4] * a[2] * 2;
        }
        if (sum > sum1) {
            sum = sum1;
        }
        System.out.println(sum);
        scan.close();
    }
}