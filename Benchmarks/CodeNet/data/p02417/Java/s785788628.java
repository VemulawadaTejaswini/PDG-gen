import java.util.*;
import java.lang.*;

/**
 * Shuffle
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] count = new int[26];

        while (sc.hasNext()) {
            String str = sc.next();
            str = str.toLowerCase();

            for (int i = 0; i < str.length(); i++) {
                if (0 <= str.charAt(i) - 'a' && str.charAt(i) - 'a' < 26)
                    count[str.charAt(i) - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            char[] charArray = Character.toChars('a' + i);
            String s = new String(charArray);
            System.out.println(s + " : " + count[i]);
        }
    }
}
