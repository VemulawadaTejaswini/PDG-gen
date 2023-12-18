import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            String input = in.readLine();

            String[] inputs = input.split("\\s+");

            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);
            int c = Integer.parseInt(inputs[2]);

            System.out.println(a < b && b < c ? "Yes" : "No");
        } catch (IOException ex) {
            // no op
        }
    }
}
