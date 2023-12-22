import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n != 0) {

            int a[] = new int[n];
            int sum = 0;
            double dispersion = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }

            double ave = (double) sum / n;

            for (int i = 0; i < n; i++) {
                dispersion += Math.pow((a[i] - ave), 2);
            }
            dispersion /= n;

            System.out.println(Math.sqrt(dispersion));

            n = sc.nextInt();

        }

        sc.close();
    }
}
