import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double t = sc.nextDouble();
        double a = sc.nextDouble();
        double min = Double.MAX_VALUE;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            double h = sc.nextDouble();
            double tmp = t - h * 0.006;
            tmp = Math.abs(tmp - a);
            if(min > tmp) {
                min = tmp;
                ans = i + 1;
            }
        }
        System.out.println(ans);
    }
}