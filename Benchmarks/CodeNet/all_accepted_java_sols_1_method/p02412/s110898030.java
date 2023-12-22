import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

            StringBuilder out = new StringBuilder();
            while (true) {
                String[] line = in.readLine().split(" ");
                int n = Integer.parseInt(line[0]);
                int x = Integer.parseInt(line[1]);

                if (n == 0 && x == 0) break;

                int cnt = 0;
                for (int i = n; i >= 3; i--) {
                    for (int j = i - 1; j >= 2; j--) {
                        int rest = x - i - j;
                        if (rest <= 0) continue;
                        else if (j <= rest) break;
                        else cnt++;
                    }
                }

                out.append(cnt);
                out.append("\n");
            }
            System.out.print(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
}

