import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
        String data = br.readLine();
        double r = Double.parseDouble(data);
        double circle1 = Math.PI * Math.pow(r, 2);
        double circle2 = 2 * Math.PI * r;

        System.out
            .println(String.format("%1$.5f %2$.5f", circle1, circle2));
    }
}