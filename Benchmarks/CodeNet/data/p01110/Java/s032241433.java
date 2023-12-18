import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    private static long ans = 0, low = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt(), m = in.nextInt(), t = in.nextInt(), p = in.nextInt();
        while (n > 0) {
            int[][] board = new int[2000][2000];
            int xmin = 1000, xmax = 1000 + n;
            int ymin = 1000, ymax = 1000 + m;
            for (int i = ymin; i < ymax; i++) {
                for (int j = xmin; j < xmax; j++) {
                    board[i][j] = 1;
                }
            }

            for (int i = 0; i < t; i++) {
                int d = in.nextInt(), c = in.nextInt();
                if (d == 1) {
                    int fold = xmax - c;
                    for (int j = ymin; j < ymax; j++) {
                        for (int k = fold; k < xmax; k++) {
                            board[j][2 * fold - k - 1] += board[j][k];
                            board[j][k] = 0;
                            xmin = Math.min(xmin, 2 * fold - k - 1);
                        }
                    }
                    xmax = fold;
                } else {
                    int fold = ymax - c;
                    for (int j = xmin; j < xmax; j++) {
                        for (int k = fold; k <ymax ; k++) {
                            board[2 * fold - k - 1][j] += board[k][j];
                            board[k][j] = 0;
                            ymin = Math.min(ymin, 2 * fold - k - 1);
                        }
                    }
                    ymax = fold;
                }
            }

            for (int i = 0; i < p; i++) {
                int x = in.nextInt(), y = in.nextInt();
                out.println(board[ymax - y - 1][xmax - x - 1]);
            }

            n = in.nextInt();
            m = in.nextInt();
            t = in.nextInt();
            p = in.nextInt();
        }
        out.flush();
    }

}

