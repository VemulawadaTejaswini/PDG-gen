import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            int n = Integer.parseInt(br.readLine());
            String tmpLArr[] = br.readLine().split(" ");
            int lArr[] = new int[2 * n];
            for (int i = 0; i < 2 * n; i++) {
                lArr[i] = Integer.parseInt(tmpLArr[i]);
            }
            Arrays.sort(lArr);
            int ans = 0;
            for (int i = 0; i < 2 * n - 1; i = i + 2) {
                ans = ans + lArr[i];
            }
            System.out.println(ans);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}