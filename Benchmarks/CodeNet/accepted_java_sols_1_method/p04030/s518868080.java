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
            String ans = "";
            for (int i = 0; i < s.length(); i++) {
                String tmp = s.substring(i, i + 1);
                if ("B".equals(tmp)) {
                    if (ans.length() > 0) {
                        ans = ans.substring(0, ans.length() - 1);
                    }
                } else {
                    ans = ans + tmp;
                }
            }
            System.out.println(ans);
        } catch (IOException e) {
            e.printStackTrace();
           }
    }
}
