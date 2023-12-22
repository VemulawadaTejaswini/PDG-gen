import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n];
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int X = 0;
        int Y = 0;
        int dis = 0;
        int dif = t[0];
        for (int i = 0; i < n; i++) {
            dis = Math.abs(X - x[i]) + Math.abs(Y - y[i]);
            X = x[i];
            Y = y[i];
            if (dif < dis) {
                System.out.println("No");
                System.exit(0);
            } else {
                if (dif % 2 == dis % 2)
                    ;
                else {
                    System.out.println("No");
                    System.exit(0);
                }
            }
            try {
                dif = t[i + 1] - t[i];
            } catch (Exception e) {

            }
        }
        System.out.println("Yes");
    }
}
