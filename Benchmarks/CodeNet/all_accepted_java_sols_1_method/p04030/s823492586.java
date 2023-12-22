import java.io.BufferedInputStream;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(new BufferedInputStream(System.in));
        String str = s.nextLine();

        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '0' || c == '1') {
                if (c == '0')
                sb.append('0');
                else
                sb.append('1');
            } else if (c == 'B') {
                if (sb.length() > 0)
                sb.deleteCharAt(sb.length()-1);
            }

        }
        System.out.println(sb.toString());
    }

}