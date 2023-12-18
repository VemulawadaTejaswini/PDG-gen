import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))){
            Map<Character, Integer> ret = new HashMap<>();
            for (int i = 0; i < 26; i++) {
                char c = (char) (i + 97);
                ret.put(c, 0);
            }

            while (true) {
                String s = in.readLine();
                if (s == null || s.equals("")) break;

                for (int i = 0; i < s.length(); i++) {
                    char c = s.charAt(i);
                    if (Character.isAlphabetic(c)) {
                        c = Character.toLowerCase(c);
                        ret.put(c, ret.get(c) + 1);
                    }
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                char c = (char) (i + 97);
                sb.append(c);
                sb.append(" : ");
                sb.append(ret.get(c));
                sb.append("\n");
            }
            System.out.print(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

