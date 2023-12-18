import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            int num = Integer.parseInt(br.readLine());
            long worstLank = 0;
            long worstScore = 0;
            for (int i = 0; i < num; i++) {
                String strArr[] = br.readLine().split(" ");
                long a = Long.parseLong(strArr[0]);
                long b = Long.parseLong(strArr[1]);
                if (i == 0 || a > worstLank) {
                    worstLank = a;
                    worstScore = b;
                }
            }
            for (long i = worstScore; i > 0; i--) {
                worstLank++;
            }
            System.out.println(worstLank);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
