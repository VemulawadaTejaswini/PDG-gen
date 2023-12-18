import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String str = br.readLine();
            int length = str.length();
            System.out.print(str.substring(0, 1));
            System.out.print(length - 2);
            System.out.println(str.substring(length - 1, length));
        } catch (IOException e) {
            e.printStackTrace();
           }
    }
}
