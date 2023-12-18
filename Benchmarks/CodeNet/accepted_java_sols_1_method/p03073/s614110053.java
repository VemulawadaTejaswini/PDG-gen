import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int[] s = scanner.next().chars().map(c -> c - '0').toArray();
        int ans1 = 0, ans2 = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] == i % 2) {
                ans1++;
            } else {
                ans2++;
            }
        }
        System.out.println(Math.min(ans1, ans2));
    }
}