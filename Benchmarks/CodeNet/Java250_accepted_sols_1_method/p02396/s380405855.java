import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
        int count = 1;
        while (true) {
            final String str = br.readLine();
            if (str.equals("0"))
                break;
            System.out.println(String.format("Case %d: %s", count, str));
            count++;
        }
    }
}