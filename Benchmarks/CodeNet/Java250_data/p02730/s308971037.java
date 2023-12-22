import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.next();
        String s0 = s.substring(0, (s.length() - 1) / 2);
        String s1 = s.substring((s.length() + 1) / 2);
        System.out.println(isKaibun(s0) && s0.equals(s1) ? "Yes" : "No");
    }

    static boolean isKaibun(String str) {
        return str.length() <= 1 ? true :
                str.charAt(0) == str.charAt(str.length() -1) ? isKaibun(str.substring(1, str.length() - 1)) : false;
    }
}
