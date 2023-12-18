import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String S = reader.readLine();

            for (int i = 1; i <= S.length(); i++) {
                char c = S.charAt(i - 1);

                if (i % 2 == 1) {
                    if (c == 'R' || c == 'U' || c == 'D') {
                    } else {
                        System.out.println("No");
                        System.exit(0);
                    }
                } else {
                    if (c == 'L' || c == 'U' || c == 'D') {
                    } else {
                        System.out.println("No");
                        System.exit(0);
                    }
                }
            }

            System.out.println("Yes");
        }
    }

}
