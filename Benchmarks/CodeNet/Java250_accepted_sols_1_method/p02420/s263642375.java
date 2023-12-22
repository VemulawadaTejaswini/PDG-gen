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
        LinkedList<Character> list;
        while (sc.hasNext()) {
            String s = sc.next();
            if (s.equals("-")) break;
            int n = sc.nextInt();
            list = new LinkedList<>();
            
            for (int i = 0; i < s.length(); i++) {
                list.addLast(s.charAt(i));
            }
            
            for (int i = 0; i < n; i++) {
                int m = sc.nextInt();
                for (int j = 0; j < m; j++) {
                    list.addLast(list.pollFirst());
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                sb.append(list.get(i));
            }
            System.out.println(sb);
        }
    }
}