import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char[] chars = s.toCharArray();
        int numChanges = 0;

        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                chars[i + 1] = (char)(1 - (chars[i + 1] - '0') + '0');
                numChanges++;
            }
        }

        System.out.println(numChanges);

    }
}
