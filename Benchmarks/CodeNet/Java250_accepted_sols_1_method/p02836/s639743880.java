import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int size = s.length();
        if (size < 2) {
            System.out.println(0);
            return;
        }

        int half = size / 2;
        int p = half - 1;
        if (size % 2 != 0) {
             half = size / 2 + 1;
             p = half - 2;
        }
        int ans = 0;
        while (p>=0) {
            if (s.charAt(p) != s.charAt(half)) ans++;
            p--;
            half++;
        }
        System.out.println(ans);
    }

}
