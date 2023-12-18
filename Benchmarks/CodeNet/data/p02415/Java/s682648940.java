import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            String input = in.readLine();
            StringBuilder out = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                if (Character.isUpperCase(input.charAt(i))) {
                    out.append(Character.toLowerCase(input.charAt(i)));
                } else if (Character.isLowerCase(input.charAt(i))) {
                    out.append(Character.toUpperCase(input.charAt(i)));
                } else {
                    out.append(input.charAt(i));
                }
            }

            System.out.println(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
}

