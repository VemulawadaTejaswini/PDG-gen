import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String input = reader.readLine();
            if (input == null || input.equals("0")) {
                break;
            }
            long value = Long.parseLong(input);
            int count = 0;
            for (long i = 5; i <= value; i *= 5) {
                count += value / i;
            }
            System.out.println(count);
        }
    }
}