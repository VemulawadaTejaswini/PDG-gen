import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String str[] = br.readLine().split(" ");
            double a = Double.parseDouble(str[0]);
            double b = Double.parseDouble(str[1]);
            double temp = (a + b) / 2;
            int ans = (int)temp;
            if (temp > ans) {
                ans++;
            }
            System.out.println(ans);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
