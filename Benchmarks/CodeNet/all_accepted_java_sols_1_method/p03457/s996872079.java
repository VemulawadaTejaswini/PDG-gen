import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ts = new int[n + 1];
        int[] xs = new int[n + 1];
        int[] ys = new int[n + 1];
        ts[0] = 0;
        xs[0] = 0;
        ys[0] = 0;

        for (int i = 1; i <= n; i++) {
            ts[i] = scanner.nextInt();
            xs[i] = scanner.nextInt();
            ys[i] = scanner.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            int d_t = ts[i] - ts[i - 1];
            int d_x = xs[i] - xs[i - 1];
            int d_y = ys[i] - ys[i - 1];

            int x_abs = Math.abs(d_x);
            int y_abs = Math.abs(d_y);
            if (d_t % 2 == 0) {
                if (x_abs + y_abs <= d_t && (x_abs + y_abs) % 2 == 0) {
                    continue;
                } else {
                    System.out.print("No");
                    return;
                }
            } else {
                if (x_abs + y_abs <= d_t && (x_abs + y_abs) % 2 == 1) {
                    continue;
                } else {
                    System.out.print("No");
                    return;
                }
            }
        }

        System.out.print("Yes");
    }
}

