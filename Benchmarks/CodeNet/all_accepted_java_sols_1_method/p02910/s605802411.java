import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String tapsInput = sc.next();
        char[] taps = tapsInput.toCharArray();
        int length = taps.length;

        for (int i = 0; i < length; i++) {
            if (i % 2 == 0 && taps[i] == 'L') { // even
                System.out.println("No");
                return;
            } else if (i % 2 == 1 && taps[i] == 'R') { // odd
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}