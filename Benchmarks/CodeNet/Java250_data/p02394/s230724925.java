import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
        final String[] str = br.readLine().split(" ");
        final int W = Integer.parseInt(str[0]);
        final int H = Integer.parseInt(str[1]);
        final int x = Integer.parseInt(str[2]);
        final int y = Integer.parseInt(str[3]);
        final int r = Integer.parseInt(str[4]);
        final int cX1 = x - r;
        final int cX2 = x + r;
        final int cY1 = y - r;
        final int cY2 = y + r;

        if (0 <= cX1 && cX2 <= W && 0 <= cY1 && cY2 <= H) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}