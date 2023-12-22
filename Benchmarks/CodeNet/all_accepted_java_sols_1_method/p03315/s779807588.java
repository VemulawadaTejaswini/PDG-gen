import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        String s = sc.next();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '+') {
                ans += 1;
            } else {
                ans -= 1;
            }
        }
        System.out.println(ans);
    }
}