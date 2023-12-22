import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String input = br.readLine();
            Map<String, String> nextAlphabet = new HashMap<>();
            nextAlphabet.put("a", "b");
            nextAlphabet.put("b", "c");
            nextAlphabet.put("c", "d");
            nextAlphabet.put("d", "e");
            nextAlphabet.put("e", "f");
            nextAlphabet.put("f", "g");
            nextAlphabet.put("g", "h");
            nextAlphabet.put("h", "i");
            nextAlphabet.put("i", "j");
            nextAlphabet.put("j", "k");
            nextAlphabet.put("k", "l");
            nextAlphabet.put("l", "m");
            nextAlphabet.put("m", "n");
            nextAlphabet.put("n", "o");
            nextAlphabet.put("o", "p");
            nextAlphabet.put("p", "q");
            nextAlphabet.put("q", "r");
            nextAlphabet.put("r", "s");
            nextAlphabet.put("s", "t");
            nextAlphabet.put("t", "u");
            nextAlphabet.put("u", "v");
            nextAlphabet.put("v", "w");
            nextAlphabet.put("w", "x");
            nextAlphabet.put("x", "y");
            nextAlphabet.put("y", "z");
            nextAlphabet.put("z", "a");

            System.out.println(nextAlphabet.get(input).toString());
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}