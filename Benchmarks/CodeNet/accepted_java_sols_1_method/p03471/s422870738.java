import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            args = reader.readLine().split(" ");
            int N = Integer.parseInt(args[0]);
            int Y = Integer.parseInt(args[1]);

            for (int i = 0; i <= (Y / 10000); i++) {
                for (int j = 0; j <= ((Y - 10000 * i) / 5000); j++) {
                    int y = 10000 * i + 5000 * j + 1000 * (N - i - j);
                    if (y == Y) {
                        System.out.println(i + " " + j + " " + (N - i - j));
                        System.exit(0);
                    }
                }
            }

            System.out.println("-1 -1 -1");
        }
    }

}
