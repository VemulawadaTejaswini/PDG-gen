import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@SuppressWarnings("unchecked")
public class Main {
    public static void main(String[] args) throws IOException {
        final String s;

        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            s = reader.readLine();
        }

        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == '1') System.out.print("9");
            else if (s.charAt(i) == '9') System.out.print("1");
            else System.out.print(s.charAt(i));

        System.out.println();
    }
}
