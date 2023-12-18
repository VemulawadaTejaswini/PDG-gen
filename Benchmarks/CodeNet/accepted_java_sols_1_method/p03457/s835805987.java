import java.util.Scanner;

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
        boolean flag = true;
        if (t[0] < x[0] + y[0]) {
            flag = false;
        }
        if (t[0] % 2 != (x[0] + y[0]) % 2) {
            flag = false;
        }
        if (n >= 2) {
            for (int i = 0; i < n - 1; i++) {
                int deltaT = t[i + 1] - t[i];
                int deltaX = Math.abs(x[i + 1] - x[i]);
                int deltaY = Math.abs(y[i + 1] - y[i]);
                int deltaPos = deltaX + deltaY;
                if (deltaT < deltaPos) {
                    flag = false;
                }
                if (deltaT % 2 != deltaPos % 2) {
                    flag = false;
                }
            }
        }
        System.out.println(flag ? "Yes" : "No");
    }
}