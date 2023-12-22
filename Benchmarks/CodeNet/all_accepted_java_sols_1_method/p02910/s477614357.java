import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean ans = true;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((i % 2 == 0 && c == 'L') || (i % 2 == 1 && c == 'R')) {
                ans = false;
                break;
            }
        }
        System.out.println(ans ? "Yes":"No");
    }
}