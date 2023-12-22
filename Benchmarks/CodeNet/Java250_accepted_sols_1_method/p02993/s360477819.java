import java.util.*;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char tmp = s.charAt(0);
        boolean isGood = true;
        for (int i = 1; i < s.length(); i++) {
            if (tmp == s.charAt(i)) {
                isGood = false;
            }
            tmp = s.charAt(i);
        }
        System.out.println(isGood ? "Good" : "Bad");
    }
}