import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String regexp1 = "\\bthe\\b";
        String regexp2 = "\\bthis\\b";
        String regexp3 = "\\bthat\\b";
        Pattern p1 = Pattern.compile(regexp1);
        Pattern p2 = Pattern.compile(regexp2);
        Pattern p3 = Pattern.compile(regexp3);
        try {
            while (true) {
                char c;
                String line = br.readLine();
                int offset = 0;
                while (offset < 26) {
                    for (int i = 0; i < line.length(); i++) {
                        c = line.charAt(i);
                        if (97 <= (int) c && (int) c <= 122) {
                            c = (char) (((int) c - 97 + offset) % 26 + 97);
                        }
                        sb.append(c);
                    }
                    if (check(p1, sb.toString())
                            || check(p2, sb.toString())
                            || check(p3, sb.toString())) {
                        System.out.println(sb.toString());
                        sb.delete(0, sb.toString().length());
                        break;
                    }
                    sb.delete(0, sb.toString().length());
                    offset++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean check(Pattern p, String str) {
        Matcher m = p.matcher(str);
        return m.find();
    }
}