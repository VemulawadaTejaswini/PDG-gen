import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String count = br.readLine();
            System.out.println("ABC" + count);
        } catch (IOException e) {
            e.printStackTrace();
           }
    }
}