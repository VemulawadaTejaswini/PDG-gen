import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        String s = scanner.next();
        int n = s.length();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'A') {
                list.add(1);
            } else if (i != n - 1 && s.charAt(i) == 'B' && s.charAt(i + 1) == 'C') {
                list.add(2);
                i++;
            } else if (list.isEmpty() || list.get(list.size() - 1) != 3) {
                list.add(3);
            }
        }
        long ans = 0;
        int count = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) == 1) {
                ans += count;
            } else if (list.get(i) == 2) {
                count++;
            } else {
                count = 0;
            }
        }
        System.out.println(ans);
    }
}