import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean black = false;
        if ('B' == s.charAt(0)) {
            black = true;
        }
        int cnt = 1;
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (black && 'B' == c || !black && 'W' == c) {
                continue;
            }
            black = Boolean.logicalXor(black, true);
            cnt++;
        }
        System.out.println(cnt - 1);
    }

}
