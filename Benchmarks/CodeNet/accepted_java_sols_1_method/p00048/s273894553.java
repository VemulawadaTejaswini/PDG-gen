import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String input = reader.readLine();
            if (input == null) {
                break;
            }
            String out = "";
            double weight = Double.parseDouble(input);
            if (weight <= 48.00) {
                out = "light fly";
            } else if (weight <= 51.00) {
                out = "fly";
            } else if (weight <= 54.00) {
                out = "bantam";
            } else if (weight <= 57.00) {
                out = "feather";
            } else if (weight <= 60.00) {
                out = "light";
            } else if (weight <= 64.00) {
                out = "light welter";
            } else if (weight <= 69.00) {
                out = "welter";
            } else if (weight <= 75.00) {
                out = "light middle";
            } else if (weight <= 81.00) {
                out = "middle";
            } else if (weight <= 91.00) {
                out = "light heavy";
            } else {
                out = "heavy";
            }
            System.out.println(out);
        }
    }
}