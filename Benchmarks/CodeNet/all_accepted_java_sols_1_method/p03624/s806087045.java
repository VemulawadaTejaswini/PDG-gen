import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        boolean[] backet = new boolean[26];

        for (int i = 0; i < s.length; i++) {
            backet[s[i] - 'a'] = true;
        }

        String res = "None";
        for (int i = 0; i < backet.length; i++) {
            if (backet[i]) {
                continue;
            } else {
                char ans = (char)(i+'a');
                res = String.valueOf(ans);
                break;
            }
        }

        System.out.println(res);
    }
}
