import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String S = in.next();

            HashSet<Integer> used = new HashSet<Integer>();
            for (int i = 0; i < S.length(); i++) {
                used.add((int) S.charAt(i));
            }

            for (int i = 'a'; i <= 'z'; i++) {
                if (used.contains(i)) {
                    continue;
                }

                System.out.println((char) i);
                return;
            }

            System.out.println("None");
        }
    }
}
