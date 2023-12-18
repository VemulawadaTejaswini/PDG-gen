import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            double sum = 0;
            while ((line = br.readLine()) != null) {
                if (line.contains(" ")) {
                    String[] tokens = line.split(" ");
                    if ("JPY".equals(tokens[1])) {
                        sum = sum + Integer.parseInt(tokens[0]);
                    }
                    if ("BTC".equals(tokens[1])) {
                        sum = sum + Double.parseDouble(tokens[0]) * 380000.0;
                    }
                }
            }
            System.out.println(sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
