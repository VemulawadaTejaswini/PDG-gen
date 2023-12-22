import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            int r = Integer.parseInt(br.readLine());
            int g = Integer.parseInt(br.readLine());
            int x = g * 2 - r;
            System.out.println(x);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
