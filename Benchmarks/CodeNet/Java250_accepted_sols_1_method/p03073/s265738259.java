import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int len = n.length();
        int a = 0; // 01010101
        int b = 0; // 10101010
        for (int i = 0; i < len; i++) {
            char c = n.charAt(i);
            if (i % 2 == 0) {
                if (c == '1') {
                    a++;
                } else {
                    b++;
                }
            } else {
                if (c == '0') {
                    a++;
                } else {
                    b++;
                }
            }
        }
        System.out.println(Math.min(a, b));
        return;
    }
}
