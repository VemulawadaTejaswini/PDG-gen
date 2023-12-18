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
            int arr[] = new int[100];
            for (int i = 0; i < n; i++) {
                int tmp = Integer.parseInt(br.readLine());
                arr[tmp - 1]++;
            }
            int count = 0;
            for (int i = 0; i < 100; i++) {
                if (arr[i] > 0) {
                    count++;
                }
            }
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
