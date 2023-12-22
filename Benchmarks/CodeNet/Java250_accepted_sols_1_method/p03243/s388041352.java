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
            while (true) {
                String tmp = String.valueOf(n);
                if (tmp.charAt(0) == tmp.charAt(1) && tmp.charAt(0) == tmp.charAt(2)) {
                    System.out.println(n);
                    break;
                }
                n++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
