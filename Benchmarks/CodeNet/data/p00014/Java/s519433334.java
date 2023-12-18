import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while ((input = reader.readLine()) != null) {
            int d = Integer.parseInt(input);
            int result = 0;

            for (int x = d; x < 600; x += d) {
                result += x * x * d;
            }

            System.out.println(result);
        }
    }
}