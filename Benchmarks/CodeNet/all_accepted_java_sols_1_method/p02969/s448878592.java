import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int r = Integer.parseInt(reader.readLine());

            System.out.println(3 * r * r);
        }
    }

}
