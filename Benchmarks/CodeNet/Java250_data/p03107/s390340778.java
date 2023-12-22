import java.util.*;


public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int beforeSize = a.length();
        int zero = 0;
        int one = 0;
        for (char c : a.toCharArray()) {
            if (c == '0') {
                zero++;
            } else {
                one++;
            }
        }
        int sub = zero - one;
        if (sub < 0) {
            sub = sub * -1;
        }
        System.out.println(beforeSize - sub);
    }
}
