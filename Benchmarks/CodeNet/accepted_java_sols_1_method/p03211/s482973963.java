import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 100000000;
        for (int i = 0; i < s.length()-2; i++) {
            ans = Math.min(ans, Math.abs(Integer.parseInt(s.substring(i, i+3)) - 753));
        }
        System.out.println(ans);
    }
}
