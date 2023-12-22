import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String S = s.next();
        boolean ok = true;
        for (int i = 1; i <= S.length(); i++) {
            char c = S.charAt(i-1);
            if (i % 2 != 0 && !(c == 'R' || c == 'U' || c == 'D')) ok = false;
            if (i % 2 == 0 && !(c == 'L' || c == 'U' || c == 'D')) ok = false;
        }
        if (ok) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}