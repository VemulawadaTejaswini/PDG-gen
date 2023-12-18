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
            long x = Long.parseLong(str[0]);
            long y = Long.parseLong(str[1]);
            long count = 0;
            while (true) {
                if (x > y) {
                    break;
                }
                count++;
                x = x * 2;
            }
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
