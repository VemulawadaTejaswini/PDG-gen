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
            int x = Integer.parseInt(strArr[1]);
            int min = -1;
            for (int i = 0; i < n; i++) {
                int temp = Integer.parseInt(br.readLine());
                x -= temp;
                if (min == -1 || min > temp) {
                    min = temp;
                }
            }
            n += x / min;
            System.out.println(n);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
