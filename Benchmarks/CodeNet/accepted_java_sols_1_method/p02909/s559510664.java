import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String S = reader.readLine();

            if (S.equals("Sunny")) {
                System.out.println("Cloudy");
            } else if (S.equals("Cloudy")) {
                System.out.println("Rainy");
            } else {
                System.out.println("Sunny");
            }
        }
    }

}
