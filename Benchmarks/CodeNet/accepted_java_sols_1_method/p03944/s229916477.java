import java.util.*;

import org.ietf.jgss.Oid;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int N = sc.nextInt();
        int x[] = new int[N];
        int y[] = new int[N];
        int a[] = new int[N];

        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            a[i] = sc.nextInt();
        }
        int xmin = 0;
        int xmax = W;
        int ymin = 0;
        int ymax = H;
        for (int i = 0; i < N; i++) {
            switch (a[i]) {
            case 1:
                xmin = Math.max(x[i], xmin);
                break;
            case 2:
                xmax = Math.min(x[i], xmax);
                break;
            case 3:
                ymin = Math.max(y[i], ymin);
                break;
            case 4:
                ymax = Math.min(y[i], ymax);
                break;
            }
        }

        if (xmax <= xmin || ymax <= ymin) {
            System.out.println(0);
        } else {
            System.out.println((xmax - xmin) * (ymax - ymin));
        }
    }
}