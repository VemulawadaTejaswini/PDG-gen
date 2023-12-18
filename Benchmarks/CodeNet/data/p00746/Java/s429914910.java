import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    //cord: x,y
    static final int dir[][] = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";

        while ((line = br.readLine()) != null && !line.isEmpty()) {
            int n = Integer.parseInt(line);
            if (n == 0) {
                break;
            }
            int[][] square = new int[n][2];
            int[] xs = {0, 0};
            int[] ys = {0, 0};

            for (int i = 1; i < n; i++) {
                line = br.readLine();
                int t = Integer.parseInt(line.substring(0, line.indexOf(' ')));
                int d = Integer.parseInt(line.substring(line.indexOf(' ') + 1));
                square[i][0] = square[t][0] + dir[d][0];
                square[i][1] = square[t][1] + dir[d][1];
                if (square[i][0] < xs[0]) {
                    xs[0] = square[i][0];
                }
                if (square[i][0] > xs[1]) {
                    xs[1] = square[i][0];
                }
                if (square[i][1] < ys[0]) {
                    ys[0] = square[i][1];
                }
                if (square[i][1] > xs[1]) {
                    ys[1] = square[i][1];
                }
            }
            System.out.println((xs[1] - xs[0] + 1) + " " + (ys[1] - ys[0] + 1));
        }
    }
}