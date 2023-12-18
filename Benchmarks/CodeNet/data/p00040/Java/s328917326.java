import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

class Main {

    public static void main(String[] args) throws IOException {
        doit(args, System.in, System.out);
    }

    static void doit(String[] args, InputStream in, PrintStream out)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            String line = reader.readLine();
            Set<String> fours = new HashSet<String>();
            for (String word : line.split(" ")) {
                if (word.length() == 4) {
                    fours.add(word);
                }
            }
            for (int a : alphas) {
                for (int b = 0; b < 26; b++) {
                    if (fours.contains(encode("that", a, b))
                            || fours.contains(encode("this", a, b))) {
                        out.println(decode(line, a, b));
                        break;
                    }
                }
            }
        }
    }

    private static final String encode(String s, int a, int b) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                sb.append((char) ((a * (ch - 'a') + b) % 26 + 'a'));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    private static final String decode(String s, int a, int b) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                int x = ((ch - 'a') - b + 26) % 26;
                while (x % a != 0) {
                    x += 26;
                }
                sb.append((char) (x / a + 'a'));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    private static final int[] alphas = { 1, 3, 5, 7, 9, 11, 15, 17, 19, 21,
            23, 25 };
}