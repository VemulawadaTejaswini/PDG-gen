import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t[] = new int[n];
        int x[] = new int[n];
        int y[] = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int xg = 0;
        int yg = 0;
        int tg = 0;
        boolean no = false;
        for (int i = 0; i < n; i++) {
            int hun = t[i] - tg - (Math.abs(x[i] - xg) + Math.abs(y[i] - yg));
            if (hun < 0 || hun % 2 != 0) {
                no = true;
                break;
            } else {
                xg = x[i];
                yg = y[i];
                tg = t[i];
            }
        }
        if (no) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
