import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'R') continue;
            int j = i;
            while (j + 1 < s.length() && s.charAt(j + 1) == 'R') j++;
            ans = Math.max(ans, j - i + 1);
        }
        System.out.println(ans);
    }
}
