import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        double a = sc.nextDouble();

        double min = Double.MAX_VALUE;
        int num = 0;

        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            double k = t - h * 0.006;
            double sa = Math.abs(a - k);
            if (min > sa) {
                min = sa;
                num = i + 1;
            }
        }

        sc.close();

        System.out.print(num);

    }
}