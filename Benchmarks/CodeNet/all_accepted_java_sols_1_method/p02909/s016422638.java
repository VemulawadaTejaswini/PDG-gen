import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String S = in.next();

            String[] s = new String[] { "Sunny", "Cloudy", "Rainy", };

            for (int i = 0; i < s.length; i++) {
                if (s[i].equals(S)) {
                    System.out.println(s[(i + 1) % 3]);
                    return;
                }
            }
        }
    }
}
