import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String S = in.next();
            int[] used = new int['z' - 'a' + 1];
            for (int i = 0; i < S.length(); i++) {
                if (used[S.charAt(i) - 'a']++ > 0) {
                    System.out.println("no");
                    return;
                }
            }
            System.out.println("yes");
        }
    }
}
