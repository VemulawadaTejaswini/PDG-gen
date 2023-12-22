import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String strArr[] = br.readLine().split(" ");
            int n = Integer.parseInt(strArr[0]);
            int k = Integer.parseInt(strArr[1]);
            long result = k;
            for (int i = 1; i < n; i++) {
                result = result * (k - 1);
            }
            System.out.println(result);
       } catch (IOException e) {
            e.printStackTrace();
       }
    }
}
