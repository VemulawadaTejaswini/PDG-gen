import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String buffer;
        Pattern p = Pattern.compile("this|that|the");
        while ((buffer = br.readLine()) != null) {
            String ans = "";
            for (int i = 0; i < 26; i++) {
                char[] tmp = buffer.toCharArray();
                for (int j = 0; j < tmp.length; j++)
                    if (tmp[j] != '.' && tmp[j] != ' ')
                        tmp[j] = (char) ('a' + (tmp[j] - 'a' + i) % 26);
                ans = String.valueOf(tmp);
                Matcher m = p.matcher(ans);
                if (m.find()) {
                    i = 26;
                    break;
                }
            }
            System.out.println(ans);
        }
    }

}