import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            double a = Math.sqrt(Math.pow(x[i], 2) + Math.pow(y[i], 2));
            if (a <= d) {
                sum++;
            }
        }
        System.out.println(sum);
    }

}
