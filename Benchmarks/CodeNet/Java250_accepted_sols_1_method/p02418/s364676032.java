import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.Collections;
import java.math.BigDecimal;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String s = sc.next();
        String p = sc.next();
        for (int i = 0; i < s.length(); i++) {
            s = s.substring(s.length()-1, s.length()) + s.substring(0, s.length()-1);
            if (s.indexOf(p) != -1) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}