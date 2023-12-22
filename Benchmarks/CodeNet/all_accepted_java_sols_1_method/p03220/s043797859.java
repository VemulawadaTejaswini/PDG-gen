import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int A = sc.nextInt();
        double[] ave = new double[N];
        for (int i = 0; i < N; i++) {
            int H = sc.nextInt();
            ave[i] = Math.abs(T - H * 0.006 - A);
        }
        double min = Math.pow(10, 9);
        int res = 0;
        for (int i = 0; i < N; i++) {
            min = Math.min(min, ave[i]);
            if (ave[i] == min) {
                res = i + 1;
            }
        }
        System.out.println(res);
        sc.close();
    }
}