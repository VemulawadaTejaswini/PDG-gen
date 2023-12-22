import java.util.*;
import java.lang.*;

public class Main {

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        char[] s = in.next().toCharArray();
        if (s[0] == s[1] && s[1] == s[2]) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}