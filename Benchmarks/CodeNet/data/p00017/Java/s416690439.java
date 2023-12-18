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
            char[] tmp = buffer.toCharArray();
            while (true) {
                for (int j = 0; j < tmp.length; j++)
                    if (tmp[j] != '.' && tmp[j] != ' ')
                        tmp[j] = (char) ('a' + (tmp[j] - 'b') % 26);
                buffer = String.valueOf(tmp);
                Matcher m = p.matcher(buffer);
                if (m.find())
                    break;
            }
            System.out.println(buffer);
        }
    }
}