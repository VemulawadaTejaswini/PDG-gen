import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t[] = new int[n];
        int x[] = new int[n];
        int y[] = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = in.nextInt();
            x[i] = in.nextInt();
            y[i] = in.nextInt();
        }

        int ct = 0, cx = 0, cy = 0;
        for (int i = 0; i < n; i++) {
            int time = t[i] - ct;
            int diffX = Math.abs(x[i] - cx);
            int diffY = Math.abs(y[i] - cy);

            if (diffX + diffY > time) {
                System.out.println("No");
                return;
            }

            if (time % 2 != (diffX + diffY) % 2) {
                System.out.println("No");
                return;
            }

            ct = t[i];
            cx = x[i];
            cy = y[i];
        }

        System.out.println("Yes");
    }
}