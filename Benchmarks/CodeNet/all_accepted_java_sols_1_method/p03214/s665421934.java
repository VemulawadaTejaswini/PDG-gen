import java.util.*;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] a = new double[N];
        double av = 0;
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
            av += a[i];
        }
        av = av / (double) N;
        for (int i = 0; i < N; i++) {
            a[i] = Math.abs(a[i] - av);
        }
        double min = 1000;
        int minf = -1;
        for (int i = 0; i < N; i++) {
            if (a[i] < min) {
                min = a[i];
                minf = i;
            }
        }
        System.out.println(minf);
    }
}
