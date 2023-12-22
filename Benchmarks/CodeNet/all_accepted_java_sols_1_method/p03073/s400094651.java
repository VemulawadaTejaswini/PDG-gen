
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int p1 = 0, p2 = 0;
        if (S.length() == 1) {
            System.out.println(0);
            return;
        }

        if (S.charAt(0) == '0') p1 ++;
        if (S.charAt(0) == '1') p2 ++;
        for (int i = 1; i < S.length(); i ++) {
            if (i % 2 == 1) {
                if (S.charAt(i) == '1') {
                    p1 ++;
                } else {
                    p2 ++;
                }
            } else {
                if (S.charAt(i) == '0') {
                    p1 ++;
                } else {
                    p2 ++;
                }
            }
        }

        System.out.println(Math.min(p1, p2));
    }
}
