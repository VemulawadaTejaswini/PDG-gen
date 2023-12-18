import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            int n = Integer.parseInt(br.readLine());
            String str[] = br.readLine().split(" ");
            int ans = 3;
            int minus = 1;
            for (int i = 0; i < str.length; i++) {
                int temp = Integer.parseInt(str[i]);
                if (temp % 2 == 0) {
                    minus = minus * 2;
                }
                if (i != 0) {
                    ans = ans * 3;
                }
            }
            System.out.println(ans - minus);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
