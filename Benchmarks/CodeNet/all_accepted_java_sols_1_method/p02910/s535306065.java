import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String S = in.next();
        int i = 1;
        for (char c : S.toCharArray()) {
            if (i % 2 == 0) {
                if (c == 'L' || c == 'U' || c == 'D') {}
                else {
                    System.out.println("No");
                    return;
                }
            } else {
                if (c == 'R' || c == 'U' || c == 'D') {}
                else {
                    System.out.println("No");
                    return;
                }
            }
            i++;
        }
        System.out.println("Yes");
    }
}
