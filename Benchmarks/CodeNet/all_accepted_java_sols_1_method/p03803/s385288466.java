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
            int a = Integer.parseInt(str[0]);
            if (a == 1) {
                a = 14;
            }
            int b = Integer.parseInt(str[1]);
            if (b == 1) {
                b = 14;
            }
            if (a == b) {
                System.out.println("Draw");
            } else if (a > b) {
                System.out.println("Alice");
            } else {
                System.out.println("Bob");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}