import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        int count = 0;
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if (ss[i] != tt[i]) {
                count = count + 1;
            }
        }

        System.out.println(count);
    }
}