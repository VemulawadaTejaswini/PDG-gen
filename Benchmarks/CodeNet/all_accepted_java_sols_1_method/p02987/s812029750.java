
import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String s = stdIn.next();
        char[] c = s.toCharArray();
        Arrays.sort(c);
        System.out.println(c[0] == c[1] && c[2] == c[3] && c[0] != c[2] ? "Yes" : "No");
    }
}