import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            int c = Integer.parseInt(br.readLine());
            int x = Integer.parseInt(br.readLine());
            int ans = 0;
            for (int i = 0; i <= a; i++) {
                for (int j = 0; j <= b; j++) {
                    for (int k = 0; k <= c; k++) {
                        int temp = 500 * i + 100 * j + 50 * k;
                        if (x == temp) {
                            ans++;
                        }
                    }
                }
            }
            System.out.println(ans);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
