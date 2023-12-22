import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String args[]) throws IOException {
        // x+rがw以下かつy+rがh以下かつ
        // x-rが0以上かつy-rっが0以上なら長方形の中に含まれる
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int w = Integer.parseInt(str[0]);
        int h = Integer.parseInt(str[1]);
        int x = Integer.parseInt(str[2]);
        int y = Integer.parseInt(str[3]);
        int r = Integer.parseInt(str[4]);

        if (x + r <= w && y + r <= h && x - r >= 0 && y - r  >= 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
