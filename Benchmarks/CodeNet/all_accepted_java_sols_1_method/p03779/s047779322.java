import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            int x = Integer.parseInt(br.readLine());
            int i = 1;
            int temp = 0;
            int min = 0;
            int max = 0;
            while (true) {
                temp += i;
                min = -1 * temp;
                max = temp;
                if (min <= min && x <= max) {
                    System.out.println(i);
                    break;
                }
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}