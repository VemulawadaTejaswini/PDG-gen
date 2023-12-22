import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cnt = 0;
        char ch[] = new char[s.length()];
        int r = s.length();
        for (int i = 0; i < r; i++) {
            ch[i] = s.charAt(i);
        }
        for (int i = 0; i < r / 2; i++) {
            if (ch[i] != (ch[r - i - 1])) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}