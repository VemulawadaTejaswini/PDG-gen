import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String S = cin.next();

        String[] words = {"dream", "dreamer", "erase", "eraser"};

        int len = S.length();
        while (len > 0) {
            boolean found = false;
            for (String word : words) {
                if (len < word.length()) {
                    continue;
                }
                String w = S.substring(len - word.length(), len);
                if (w.equals(word)) {
                    len -= w.length();
                    found = true;
                }
            }
            if (!found) {
                break;
            }
        }

        if (len == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}