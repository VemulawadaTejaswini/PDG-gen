import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Main {

    public static void main(String[] args) throws IOException {
        doit(args, System.in, System.out);
    }

    static void doit(String[] args, InputStream in, PrintStream out)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String line = null;
        while ((line = reader.readLine()) != null && !line.isEmpty()) {
            int n = 0;
            for (String word : line.split("[ .]")) {
                if (word.length() != 3 && word.length() != 4) {
                    continue;
                }
                n = ('t' - word.charAt(0) + 26) % 26;
                String s = decrypt(word, n);
                if (s.matches("the|this|that")) {
                    break;
                }
            }
            String result = decrypt(line, n);
            out.println(result);
        }
    }

    static String decrypt(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) ('a' + (ch - 'a' + n) % 26);
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}