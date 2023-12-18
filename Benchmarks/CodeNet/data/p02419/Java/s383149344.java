import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.Collections;
import java.math.BigDecimal;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String w = sc.next();
        int res = 0;
        while (sc.hasNext()) {
            String s = sc.next();
            if (s.equals("END_OF_TEXT")) break;
            if (isContain(s, w)) res++;
        }
        System.out.println(res);
    }
    
    static boolean isContain(String s, String w) {
        s = s.toUpperCase();
        w = w.toUpperCase();
        return s.equals(w);
    }
}