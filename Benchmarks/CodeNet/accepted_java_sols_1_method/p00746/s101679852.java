import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    //cord: x,y
    final static int dir[][] = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";

        while ((line = br.readLine()) != null && !line.isEmpty()) {
            int n = Integer.parseInt(line);
            if (n == 0) {
                break;
            }
            int[][] square = new int[n][2];
            int min_x = 0, max_x = 0;
            int min_y = 0, max_y = 0;

            for (int i = 1; i < n; i++) {
                line = br.readLine();
                int t = Integer.parseInt(line.substring(0, line.indexOf(' ')));
                int d = Integer.parseInt(line.substring(line.indexOf(' ') + 1));
                square[i][0] = square[t][0] + dir[d][0];
                square[i][1] = square[t][1] + dir[d][1];
                if (square[i][0] < min_x) {
                    min_x = square[i][0];
                } else if (square[i][0] > max_x) {
                    max_x = square[i][0];
                }
                if (square[i][1] < min_y) {
                    min_y = square[i][1];
                } else if (square[i][1] > max_y) {
                    max_y = square[i][1];
                }
            }
            System.out.println((max_x - min_x + 1) + " " + (max_y - min_y + 1));
        }
    }
}