import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            int count = Integer.parseInt(br.readLine());
            String str[] = br.readLine().split(" ");
            int ans = 0;
            while (true) {
                boolean flag = false;
                for (int i = 0; i < count; i++) {
                    long tmp = Long.parseLong(str[i]);
                    if (tmp % 2 == 0) {
                        str[i] = Long.toString(tmp / 2);
                    } else {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    break;
                }
                ans++;
            }
            System.out.println(ans);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
