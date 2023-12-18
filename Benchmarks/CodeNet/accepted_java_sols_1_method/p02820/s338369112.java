import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int r = sc.nextInt();
        int s = sc.nextInt();
        int p = sc.nextInt();
        String t = sc.next();
        Map<Character, Integer> map = new HashMap<>();
        map.put('r', p);
        map.put('s', r);
        map.put('p', s);
        int ans = 0;
        boolean[] win = new boolean[n];
        for (int i = 0; i < n; i++) {
            char ci = t.charAt(i);
            if (i >= k && win[i - k] && ci == t.charAt(i - k)) {
                continue;
            }
            win[i] = true;
            ans += map.get(ci);
        }
        System.out.println(ans);
    }

}
