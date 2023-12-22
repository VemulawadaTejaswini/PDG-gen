
import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        boolean ans = false;
        for (int i = 0; i < s.length() * 2; i++) {
            if (s.equals(t))
                ans = true;
            s = s.substring(s.length() - 1) + s.substring(0, s.length() - 1);
        }
        System.out.println(ans ? "Yes" : "No");
    }

}
