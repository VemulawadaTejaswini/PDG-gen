import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            String[] line = in.readLine().split(" ");
            int x = Integer.parseInt(line[0]);
            int y = Integer.parseInt(line[1]);

            if (x < y) {
                int tmp = x;
                x = y;
                y = tmp;
            }

            while (y > 0) {
                int r = x % y;
                x = y;
                y = r;
            }

            System.out.println(x);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

