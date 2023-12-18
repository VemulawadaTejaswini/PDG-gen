
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        input = input.replaceAll("apple", "p___h");
        input = input.replaceAll("peach", "apple");
        input = input.replaceAll("p___h", "peach");
        System.out.println(input);
    }
}