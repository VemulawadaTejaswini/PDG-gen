import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            String s = reader.readLine();

            int N = Integer.parseInt(s);

            s = reader.readLine();
            String[] sl = s.split(" ");

            boolean flg = false;
            for (int i = 0; i < N; i++) {
                char x = sl[i].charAt(0);
                if (x == 'Y') {
                    flg = true;
                    break;
                }
            }

            System.out.println(flg ? "Four" : "Three");
        }
    }
}
