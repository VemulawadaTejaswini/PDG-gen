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
            int a = Integer.parseInt(br.readLine());
            System.out.println(n * n - a);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
