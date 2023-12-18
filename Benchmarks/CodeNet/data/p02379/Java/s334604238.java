import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))){
            String[] s = in.readLine().split(" ");
            double x1 = Double.parseDouble(s[0]);
            double x2 = Double.parseDouble(s[1]);
            double y1 = Double.parseDouble(s[2]);
            double y2 = Double.parseDouble(s[3]);

            System.out.printf("%.8f", Math.sqrt(Math.pow((y1 - x1), 2.0) + Math.pow((y2 - x2), 2.0)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

