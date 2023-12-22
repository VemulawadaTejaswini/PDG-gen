import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strb = new StringBuilder();
        while (true) {
            String[] data = br.readLine().split(" ");
            int h = Integer.parseInt(data[0]);
            int w = Integer.parseInt(data[1]);
            if (h == 0 && w == 0) {
                break;
            }
            boolean hFlg = true;
            boolean wFlg = true;
            for (int i = 1; i <= h; i++) {
                for (int j = 1; j <= w; j++) {
                    if (wFlg) {
                        strb.append("#");
                    } else {
                        strb.append(".");
                    }
                    wFlg = !wFlg;
                }
                strb.append("\n");
                hFlg = !hFlg;
                wFlg = hFlg ? true : false;
            }
            strb.append("\n");
        }
        System.out.print(strb);
    }
}