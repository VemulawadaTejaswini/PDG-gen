import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.substring(0, s.length() - 1);
        int max = 0;
        for (int i = 1; i <= s.length() / 2; i++) {
            if (s.substring(0, i).equals(s.substring(i, 2 * i))) {
                max = i * 2;
            }
        }
        System.out.println(max);
    }
}