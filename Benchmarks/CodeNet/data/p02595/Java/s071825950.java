import java.util.Scanner;
import java.lang.Math;

public class b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt(); int D = scan.nextInt();
        int X[] = new int[N]; int Y[] = new int[N];
        double d[] = new double[N];

        for(int i = 0; i < N; i++) {
            X[i] = scan.nextInt();
            Y[i] = scan.nextInt();
            d[i] = Math.sqrt(X[i]*X[i] + Y[i]*Y[i]);
        }

        int ans = 0;
        for(int i = 0; i < N; i++) {
            if(d[i] <= D) ans++;
        }

        System.out.println(ans);
    }
}