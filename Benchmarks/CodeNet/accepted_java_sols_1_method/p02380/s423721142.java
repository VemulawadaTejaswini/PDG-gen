import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        double a = Double.parseDouble(input[0]); //??????a
        double b = Double.parseDouble(input[1]);
        double c = Double.parseDouble(input[2]); //?§????c

        double h = b * Math.sin(Math.toRadians(c));
        double S = a * h / 2;
        double L = a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(Math.toRadians(c)));

        System.out.print(S + "\n" + L + "\n" + h + "\n");
    }
}