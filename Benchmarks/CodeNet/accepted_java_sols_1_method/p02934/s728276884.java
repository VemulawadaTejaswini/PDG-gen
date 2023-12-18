import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        double[] ary = new double[n];
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            ary[i] = 1.0 / a;
        }
        double ans = 0.0;
        for (double a : ary) {
            ans += a;
        }
        System.out.println(1.0 / ans);
    }
}