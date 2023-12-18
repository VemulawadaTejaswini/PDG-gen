import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i=0; i<n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int max = 0;
        int now;
        for (int i=0; i<n-1; i++) {
            for (int j=i+1; j<n; j++) {
                now = Math.abs(x[i] - x[j]) + Math.abs(y[i] - y[j]);
                if (now > max) max = now;
            }
        }
        System.out.print(max);
    }
}