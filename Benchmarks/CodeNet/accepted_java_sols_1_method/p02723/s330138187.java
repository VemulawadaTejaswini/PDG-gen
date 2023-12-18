import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner itr = new Scanner(System.in);
        String s = itr.next();

        if (s.charAt(2) == s.charAt(3) && s.charAt(4) == s.charAt(5)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}