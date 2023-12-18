import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + a[i];
        }
        double ave = sum * 1.0 / n;
        double sa = Math.abs(a[0] - ave);
        int check = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            double sasa = Math.abs(a[i] - ave);
            if (sa == sasa)
                count++;
            if (sa > sasa) {
                sa = sasa;
                check = i;
            }
        }
        for (int i = 0; i < n; i++) {

        }
        if (count == n) {
            System.out.println(0);
        } else {
            System.out.println(check);
        }
    }
}