import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long ans = 0;
        long w = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'W') {
                ans += i - w;
                w += 1;
            }
        }
        System.out.println(ans);
    }
}
