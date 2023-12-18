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
        int n = sc.nextInt();
        int pt = 0;
        int ph = 0;
        for (int i = 0; i < n; i++) {
            String t = sc.next();
            String h = sc.next();
            int res = t.compareTo(h);
            if (res > 0) {
                pt += 3;
            } else if (res < 0) {
                ph += 3;
            } else {
                pt++;
                ph++;
            }
        }
        
        System.out.println(pt + " " + ph);
    }
}