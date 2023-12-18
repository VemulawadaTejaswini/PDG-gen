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
            long a = Long.parseLong(strArr[0]);
            String op = strArr[1];
            long b = Long.parseLong(strArr[2]);
            if ("+".equals(op)) {
                System.out.println(a + b);
            } else {
                System.out.println(a - b);
            }
           } catch (IOException e) {
            e.printStackTrace();
       }
    }
}
