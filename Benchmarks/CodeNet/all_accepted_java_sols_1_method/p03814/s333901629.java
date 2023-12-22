import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String s = br.readLine();
            int a = 0;
            int z = 0;
            for (int i = 0; i < s.length(); i++) {
                String tmp = s.substring(i, i + 1);
                if ("A".equals(tmp)) {
                    a = i;
                    break;
                }
            }
            for (int i = s.length(); i > 0; i--) {
                String tmp = s.substring(i - 1, i);
                if ("Z".equals(tmp)) {
                    z = i;
                    break;
                }
            }
            System.out.println(z - a);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}