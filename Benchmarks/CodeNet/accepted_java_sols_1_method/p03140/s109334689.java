import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String A = sc.next();
        String B = sc.next();
        String C = sc.next();
        int ans  = 0;
        for (int i = 0; i < N; i++) {
            Set<Character> set = new HashSet<>();
            set.add(A.charAt(i));
            set.add(B.charAt(i));
            set.add(C.charAt(i));
            if (set.size() == 3) {
                ans += 2;
            } else if (set.size() == 2) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
