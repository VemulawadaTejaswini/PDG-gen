import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        String s = scanner.next();
        int max = 0;
        for (int i = 1; i < n; i++) {
            String t1 = s.substring(0, i);
            String t2 = s.substring(i);
            int count = 0;
            for (char ch = 'a'; ch <= 'z'; ch++) {
                if (t1.indexOf(ch) != -1 && t2.indexOf(ch) != -1) {
                    count++;
                }
            }
            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}