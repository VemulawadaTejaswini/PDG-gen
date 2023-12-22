import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            char[] chars = reader.readLine().toCharArray();

            if (chars[0] == chars[1] || chars[1] == chars[2] || chars[2] == chars[3]) {
                System.out.println("Bad");
            } else {
                System.out.println("Good");
            }
        }
    }

}
