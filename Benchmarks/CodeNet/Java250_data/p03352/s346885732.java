import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();

            int X = Integer.parseInt(s);

            int e = 1;
            if (X == 1) e = X;
            else {
                for (int i = 2; i <= X; i++) {
                    for (int j = 2; j <= X; j++) {
                        if (X < Math.pow(i, j)) break;
                        if (e < (int)Math.pow(i, j))
                            e = (int)Math.pow(i, j);
                    }
                }
            }

            System.out.println(e);
        }
    }
}
