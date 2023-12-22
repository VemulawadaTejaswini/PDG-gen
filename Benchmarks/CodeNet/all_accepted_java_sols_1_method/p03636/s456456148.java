import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String f = s.substring(0, 1);
        String l = s.substring(s.length() - 1, s.length());
        int m = s.substring(1, s.length() - 1).length();
        System.out.println(f + m + l);
    }
}
