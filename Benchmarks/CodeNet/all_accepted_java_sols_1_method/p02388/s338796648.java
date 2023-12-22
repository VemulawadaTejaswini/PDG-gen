import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(in.readLine());
        double b = 3;
        System.out.println((int) Math.pow(a, b));
    }
}