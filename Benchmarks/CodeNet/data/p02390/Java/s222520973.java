import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            String input = in.readLine();

            int S = Integer.parseInt(input);
            int s = S % 60;
            int m = S % (60 * 60) / 60;
            int h = S / (60 * 60);

            System.out.println(String.format("%d:%d:%d", h, m, s));
        } catch (IOException ex) {
            // no op
        }
    }
}
