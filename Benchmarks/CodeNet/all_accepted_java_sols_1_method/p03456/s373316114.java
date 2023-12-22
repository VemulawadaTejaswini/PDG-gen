import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double in = Double.parseDouble(reader.readLine().replaceFirst(" ", ""));
        double sq = Math.floor(Math.sqrt(in));
        if (Double.compare(sq * sq, in) == 0)
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
