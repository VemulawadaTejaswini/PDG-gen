import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        char[] s1 = scanner.next().toCharArray();
        char[] s2 = scanner.next().toCharArray();
        List<Boolean> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (s1[i] == s2[i]) {
                list.add(true);
            } else {
                list.add(false);
                i++;
            }
        }
        long ans = list.get(0) ? 3 : 6;
        for (int i = 1; i < list.size(); i++) {
            ans = ans * (list.get(i - 1) ? 2 : list.get(i) ? 1 : 3) % 1000000007;
        }
        System.out.println(ans);
    }
}