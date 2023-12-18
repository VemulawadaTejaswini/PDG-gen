import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Map<Character, Integer> left = new HashMap<>();
        Map<Character, Integer> right = new HashMap<>();
        left.put('q',0);
        left.put('a',0);
        left.put('z',0);
        left.put('w',0);
        left.put('s',0);
        left.put('x',0);
        left.put('e',0);
        left.put('d',0);
        left.put('c',0);
        left.put('r',0);
        left.put('f',0);
        left.put('v',0);
        left.put('t',0);
        left.put('g',0);
        left.put('b',0);
        right.put('y',0);
        right.put('h',0);
        right.put('n',0);
        right.put('u',0);
        right.put('j',0);
        right.put('m',0);
        right.put('i',0);
        right.put('k',0);
        right.put('o',0);
        right.put('l',0);
        right.put('p',0);
        
        while (sc.hasNext()) {
            String s = sc.next();
            if (s.equals("#")) break;
            boolean b = left.containsKey(s.charAt(0));
            int res = 0;
            for (int i = 1; i < s.length(); i++) {
                char c = s.charAt(i);
                boolean cur = left.containsKey(c);
                if (b != cur) res++;
                b = cur;
            }
            System.out.println(res);
        }
    }
}