import java.util.Scanner;

public class Main {
    final double EPS = 1.0e-10;
    final int INF = 1 << 28;

    void run() {
        Scanner sc = new Scanner(System.in);
        int cns[] = new int[101];
        int tns[] = new int[101];
        for (int i = 0; i < 101; i++) {
            cns[i] = i * i * i;
            tns[i] = i * (i + 1) * (i + 2) / 6;
        }
        while (true) {
            int f = sc.nextInt();
            if (f == 0)
                break;
            int lb = 0;
            int ub = 100;
            while (ub - lb > 1) {
                int mid = (lb + ub) / 2;
                if (cns[mid] < f) {
                    lb = mid;
                } else {
                    ub = mid;
                }
            }
            int cn = cns[lb];
            lb = 0;
            ub = 100;
            while (ub - lb > 1) {
                int mid = (lb + ub) / 2;
                if (tns[mid] < f) {
                    lb = mid;
                } else {
                    ub = mid;
                }
            }
            int tn = tns[lb];
            int max = Math.max(tn, cn);
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    if (tns[i] + cns[j] <= f)
                        max = Math.max(max, cns[j] + tns[i]);
                    else
                        break;
                }
            }
            System.out.println(max);
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}