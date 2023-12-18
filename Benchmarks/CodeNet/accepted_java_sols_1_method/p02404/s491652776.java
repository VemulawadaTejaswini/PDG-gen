import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strb = new StringBuilder();
        String[] data;
        int h = 0;
        int w = 0;
        while (true) {
            data = br.readLine().split(" ");
            h = Integer.parseInt(data[0]);
            w = Integer.parseInt(data[1]);
            if (h == 0 && w == 0) {
                break;
            }
            for (int i = 1; i <= h; i++) {
                for (int j = 1; j <= w; j++) {
                    if (i == 1 || i == h || j == 1 || j == w) {
                        strb.append("#");
                    } else {
                        strb.append(".");
                    }
                }
                strb.append("\n");
            }
            strb.append("\n");
        }
        System.out.print(strb);
    }
}