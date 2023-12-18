import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int debt = 100000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";

        while ((line = br.readLine()) != null && !line.isEmpty()) {
            int w = Integer.parseInt(line);
            for (int i = 0; i < w; i++) {
                debt *= 1.05;
                if (debt % 1000 > 0) {
                    debt = debt - (debt % 1000) + 1000;
                }
            }
            System.out.println(debt);
        }
    }
}