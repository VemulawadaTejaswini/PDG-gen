
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        String line = reader.readLine();
        int x = Integer.parseInt(line);

        call(1, x, builder);
        System.out.println(builder);
    }

    public static void call(int i, int n, StringBuilder builder) {
        // 3??§?????????????????? ??????
        while (i <= n) {
            int x = i;
            if (x % 3 == 0) {
                builder.append(" " + i);
            }
            else {
                // INCLUDE3
                int y = x;
                while (y > 1) {
                    if (y % 10 == 3) {
                        builder.append(" " + i);
                        break;
                    }
                    y = y / 10;
                }
            }
            i++;
        }
    }
}