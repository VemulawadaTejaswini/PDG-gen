import java.util.*;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        int ans = 0;
        int n = sc.nextInt();
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        for (int i = 0; i < n; i++) {
            HashSet<Character> se = new HashSet<Character>();
            se.add(a.charAt(i));
            se.add(b.charAt(i));
            se.add(c.charAt(i));
            ans += (se.size() - 1);
        }
        System.out.println(ans);
        sc.close();
    }
}