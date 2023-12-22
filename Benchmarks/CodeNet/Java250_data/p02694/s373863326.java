import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long k = Long.parseLong(br.readLine());
        int result = 0;
        double money = 100;
        while (money < k) {
            money = Math.floor(money * 1.01);
            result++;
        }
        System.out.println(result);
    }
}
