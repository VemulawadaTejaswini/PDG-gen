import java.util.Scanner;

public class Main {
    static int ans;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double EPS = 1e-10;
        while (true) {
            int m = sc.nextInt();
            if (m == 0)
                break;
            int[] vs = new int[m - 1];
            for (int i = 0; i < m - 1; i++) {
                vs[i] = sc.nextInt();
            }
            int n = sc.nextInt();
            int[] us = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                us[i] = sc.nextInt();
            }
            double a1 = calcArea(vs);
            double a2 = calcArea(us);
            if (Math.abs(a1 - a2) < EPS)
                System.out.println(0);
            else if (a1 > a2)
                System.out.println(1);
            else
                System.out.println(2);
        }
    }

    public static double calcArea(int vs[]) {
        double area = 0;
        int sum = 0;
        for (int i = 0; i < vs.length; i++) {
            area += Math.abs(Math.sin(Math.PI * vs[i] / 180)) / 2;
            sum += vs[i];
        }
        area += Math.abs(Math.sin(Math.PI * (360 - sum) / 180)) / 2;
        return area;
    }
}