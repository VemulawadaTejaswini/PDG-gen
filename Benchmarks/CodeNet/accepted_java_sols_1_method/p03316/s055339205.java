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
            long n = Long.parseLong(s);
            long sn = 0;
            for (int i = 0; i < s.length(); i++) {
                long tmp = Long.parseLong(s.substring(i, i + 1));
                sn += tmp;
            }
            if (n % sn == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
