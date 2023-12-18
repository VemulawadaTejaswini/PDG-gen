import java.util.Scanner;
import java.util.function.IntBinaryOperator;

public class Main {

    static int lastIndexOf(String e, char ch) {
        int nest = 0;
        for(int i = e.length()-1; i > 0 ; i--) {
            char c = e.charAt(i);
            if(c == ‘(’) {
                nest++;
            }
            if(c == ‘)’) {
                nest--;
            }
            if(ch == c && nest == 0) {
                return i;
            }
        }
        return -1;
    }
    
    static int parse(String e) {
        if(e.startsWith(“(”) && e.endsWith(“)”)) {
            return parse(e.substring(1, e.length()-1));
        }
        int loc = lastIndexOf(e, ‘-’);
        if(loc != -1) {
            return parse(e.substring(0, loc)) - parse(e.substring(loc+1));
        }
        loc = lastIndexOf(e, ‘+’);
        if(loc != -1) {
            return parse(e.substring(0, loc)) + parse(e.substring(loc+1));
        }
        loc = lastIndexOf(e, ‘/’);
        if(loc != -1) {
            return parse(e.substring(0, loc)) / parse(e.substring(loc+1));
        }
        loc = lastIndexOf(e, ‘*’);
        if(loc != -1) {
            return parse(e.substring(0, loc)) * parse(e.substring(loc+1));
        }
        return Integer.parseInt(e);
    }
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            for(int i = 0; i < n; i++) {
                String e = sc.next().replace(“=”, “”);
                System.out.println(parse(e));
            }
        }
    }
}
