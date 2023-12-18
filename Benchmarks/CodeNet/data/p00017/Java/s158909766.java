import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

    public static void main(String[] args) throws IOException {

        // ?¨??????\???
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        for (char chr : executeEncode(input.toCharArray())) {

            System.out.print(chr);

        }

    }

    public static char[] executeEncode(char[] chars) {

        for (int i = 0; i < chars.length; i++) {

            if (Character.isWhitespace(chars[i])) {
                continue;
            }

            chars[i] = (char) (chars[i] + 1);
        }

        return chars;

    }
}