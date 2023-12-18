import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.Collections;
import java.math.BigDecimal;
import java.util.LinkedList;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String t = sc.next();
        String p = sc.next();
        
        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            if (t.substring(i, i+p.length()).equals(p)) {
                System.out.println(i);
            }
        }
    }
}