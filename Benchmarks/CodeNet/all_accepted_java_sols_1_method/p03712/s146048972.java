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
            int h = Integer.parseInt(strArr[0]);
            int w = Integer.parseInt(strArr[1]);
            String ans[] = new String[h];
            for (int i = 0; i < h; i++) {
                ans[i] = br.readLine();
            }
            StringBuffer strBuf = new StringBuffer();
            for (int i = 0; i < w + 2; i++) {
                strBuf.append("#");
            }
            System.out.println(strBuf.toString());
            for (int i = 0; i < h; i++) {
                System.out.print("#");
                System.out.print(ans[i]);
                System.out.println("#");
            }
            System.out.println(strBuf.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}