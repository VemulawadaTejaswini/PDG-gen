import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 1000;
        for (int i = 0; i + 3 <= s.length(); i++) {
            String sub = s.substring(i, i + 3);
            int num = Integer.parseInt(sub);
            ans = Math.min(ans, Math.abs(753 - num));
        }
        System.out.println(ans);
    }
}