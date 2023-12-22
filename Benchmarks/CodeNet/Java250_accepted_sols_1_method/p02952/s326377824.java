import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(reader.readLine());

            int ans = 0;
            for (int i = 1; i <= N; i++) {
                if (String.valueOf(i).length() % 2 == 1) {
                    ans++;
                }
            }

            System.out.println(ans);
        }
    }

}
