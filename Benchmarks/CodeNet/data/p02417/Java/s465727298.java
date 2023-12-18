import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int[] count = new int[26];

        while(sc.hasNextLine()) {
            String S = sc.nextLine();
            for (int i = 0; i < S.length(); i++) {
                char temp = S.charAt(i);
                if (Character.isLetter(temp)) {
                    char s = Character.toLowerCase(temp);
                    count[s - 'a']++;
                }
            }
        }
        for (int i = 0; i < 26; i++) {
            out.printf("%c : %d\n", i + 'a', count[i]);
        }
        out.flush();
    }
}
