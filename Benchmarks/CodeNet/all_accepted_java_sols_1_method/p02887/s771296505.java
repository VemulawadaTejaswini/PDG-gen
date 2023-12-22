import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(reader.readLine());
            String S = reader.readLine();

            int count = 0;
            char c = ' ';
            for (int i = 0; i < N; i++) {
                char c2 = S.charAt(i);

                if (c != c2) {
                    c = c2;
                    count++;
                }
            }

            System.out.println(count);
        }
    }

}
