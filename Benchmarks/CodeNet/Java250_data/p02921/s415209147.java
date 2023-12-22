
import static java.lang.Math.pow;
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int c = 0;
        for (int i = 0; i < 3; i++) {
            if (s.charAt(i) != 'S' && s.charAt(i) != 'C' && s.charAt(i) != 'R') {
                break;
            } else if (t.charAt(i) != 'S' && t.charAt(i) != 'C' && t.charAt(i) != 'R') {
                break;
            } else {
                if (s.charAt(i) == t.charAt(i)) {
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
