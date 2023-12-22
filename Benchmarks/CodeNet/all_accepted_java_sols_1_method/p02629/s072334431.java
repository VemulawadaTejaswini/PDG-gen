import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try(var br = new BufferedReader(new InputStreamReader(System.in))) {

            var input = Long.parseLong(br.readLine());

            var result = new StringBuilder();
            while (input > 0) {
                result.insert(0, (char)((input - 1) % 26 + 97));
                input = (input - 1) / 26;
            }

            System.out.println(result.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}