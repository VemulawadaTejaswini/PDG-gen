import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        double seki = 1;
        long wa = 0;
        double b[] = new double[n];
        double wawa = 0;
        for (int i = 0; i < n; i++) {
            b[i] = 1.0 / (1.0 * a[i]);
            seki *= 1.0 * a[i];
            wawa += b[i];
        }
        for (int i = 0; i < n; i++) {
            wa += seki / a[i];
        }

        System.out.println(1.0 / wawa);
        sc.close();
    }
}
