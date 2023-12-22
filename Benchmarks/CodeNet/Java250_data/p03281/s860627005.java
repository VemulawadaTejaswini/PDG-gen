import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int count2 = 0;
            if (i % 2 != 0) {
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0)
                        count2++;
                }
                if (count2 == 8)
                    count++;
            }
        }
        System.out.println(count);
    }
}
