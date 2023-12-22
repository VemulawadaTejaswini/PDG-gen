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
            String str = br.readLine();
            int countW = 0;
            int arrW[] = new int[n];
            int countE = 0;
            int arrE[] = new int[n];
            for (int i = 0; i < n; i++) {
                char ch = str.charAt(i);
                if (ch == 'W') {
                    countW++;
                } else {
                    countE++;
                }
                arrW[i] = countW;
                arrE[i] = countE;
            }
            int min = 0;
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    min = arrE[n - 1] - arrE[i];
                } else {
                    int tmp = arrW[i - 1] + (arrE[n - 1] - arrE[i]);
                    if (min > tmp) {
                        min = tmp;
                    }
                }
            }
            System.out.println(min);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
