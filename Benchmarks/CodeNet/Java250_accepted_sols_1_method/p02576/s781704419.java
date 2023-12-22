import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String[] str = in.readLine().split(" ");
        double n = Double.parseDouble(str[0]);
        double x = Double.parseDouble(str[1]);
        int t = Integer.parseInt(str[2]);
        System.out.println((int)Math.ceil(n/x)*t);

    }
}