import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String c1 = br.readLine();
            String c2 = br.readLine();
            if (c1.charAt(0) == c2.charAt(2) && c1.charAt(1) == c2.charAt(1) && c1.charAt(2) == c2.charAt(0)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
