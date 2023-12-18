import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");
        int n = s.length;
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i < s.length-1; i++) {
            String f = String.format("%s%s%s", s[i-1], s[i], s[i+1]);
            int tmp = Integer.parseInt(f);
            ans = Math.min(ans, Math.abs(753 - tmp));
        }
        System.out.print(ans);
    }
}