import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // AGC 008 Simple Calculator
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.equals("zyxwvutsrqponmlkjihgfedcba")) {
            System.out.println(- 1);
            return;
        }
        if (s.length() == 26) {
            for (int i = 24; i >= 0; i--) {
                char target = s.charAt(i);
                char c = 'z';
                boolean exist = false;
                for (int j = i + 1; j < s.length(); j++) {
                    if (target < s.charAt(j)) {
                        exist = true;
                        if (c > s.charAt(j)) {
                            c = s.charAt(j);
                        }
                    }
                }
                if (exist) {
                    System.out.println(s.substring(0, i) + c);
                    return;
                }
            }
        }
        char last = 'a';
        while (true) {
            if (s.indexOf(last) == - 1) {
                System.out.println(s + last);
                return;
            }
            last++;
        }
    }
}