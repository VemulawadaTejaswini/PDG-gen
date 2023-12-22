import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * AOJ0075 BMI
 */
public class Main {
    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while ((line = br.readLine()) != null) {
            String[] in = line.split(",");
            int id = Integer.parseInt(in[0]);
            double w = Double.parseDouble(in[1]);
            double h = Double.parseDouble(in[2]);
            double bmi = w / (h * h);
            if (bmi >= 25.0) {
                System.out.println(id);
            }
        }
    }
}