import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String w = in.next();

            int[] counts = new int['z' - 'a' + 1];
            for (int i = 0; i < w.length(); i++) {
                counts[w.charAt(i) - 'a']++;
            }

            for (int i = 0; i < counts.length; i++) {
                if (counts[i] % 2 != 0) {
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("Yes");
        }
    }
}
