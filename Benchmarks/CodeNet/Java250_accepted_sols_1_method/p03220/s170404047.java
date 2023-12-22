import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        double a = sc.nextDouble();
        int[] h = new int[n];
        int flag = 1;
        double[] t_ave = new double[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            t_ave[i] = t - h[i] * 0.006;
        }
        double min = Math.abs(a - t_ave[0]);
        for (int i = 1; i < n; i++) {
            if (min > Math.abs(a - t_ave[i])) {
                min = Math.abs(a - t_ave[i]);
                flag = i + 1;
            }
        }
        System.out.println(flag);
    }
}