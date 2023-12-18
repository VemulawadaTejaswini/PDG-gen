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
        int tt = 0;
        int xx = 0;
        int yy = 0;
        for (int i = 0; i < n; i++) {
            int tmpT = t[i] - tt;
            int tmpX = Math.abs(x[i] - xx);
            int tmpY = Math.abs(y[i] - yy);
            if(tmpX + tmpY > tmpT) {
                System.out.println("No");
                return;
            }
            if(tmpT % 2 != (tmpX + tmpY) % 2) {
                System.out.println("No");
                return;
            }
            tt = t[i];
            xx = x[i];
            yy = y[i];
        }
        System.out.println("Yes");
    }
}