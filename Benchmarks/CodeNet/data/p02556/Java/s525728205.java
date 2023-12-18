import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x,y;
        int xmin = Integer.MAX_VALUE;
        int xminy = 1;
        int xmax = 1;
        int xmaxy = 1;
        int ymin = Integer.MAX_VALUE;;
        int yminx = 1;
        int ymax = 1;
        int ymaxx = 1;

        for (int i=0; i<n; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            if (x > xmax) {
                xmax = x;
                xmaxy = y;
            }
            if (x < xmin) {
                xmin = x;
                xminy = y;
            }
            if (y > ymax) {
                ymax = y;
                ymaxx = x;
            }
            if (y < ymin) {
                ymin = y;
                yminx = x;
            }
        }

        int xx = (xmax - xmin) + Math.abs(xmaxy - xminy);
        int yy = (ymax - ymin) + Math.abs(ymaxx - yminx);

        if (xx > yy) {
            System.out.print(xx);
        } else {
            System.out.print(yy);
        }
    }
}
