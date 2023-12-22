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
            int count5 = 0;
            int count7 = 0;
            for (int i = 0; i < strArr.length; i++) {
                int temp = Integer.parseInt(strArr[i]);
                if (temp == 5) {
                    count5++;
                } else if (temp == 7) {
                    count7++;
                }
            }
            if (count5 == 2 && count7 == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}