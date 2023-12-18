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
            int n = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);
            boolean flag = false;
            for (int i = n; i >= 0; i--) {
                for (int j = n - i; j >= 0; j--) {
                    for (int k = n - (i + j); k >= 0; k--) {
                        if (i + j + k != n) {
                            continue;
                        } else {
                            if (10000 * i + 5000 * j + 1000 * k == y) {
                                System.out.println(i + " " + j + " " + k);
                                flag = true;
                                break;
                            }
                        }
                    }
                    if (flag) {
                        break;
                    }
                }
                if (flag) {
                    break;
                }
            }
            if (!flag) {
                System.out.println("-1 -1 -1");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
