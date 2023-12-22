import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String s = in.next();

            StringBuilder screen = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == 'B') {
                    if (screen.length() > 0) {
                        screen.setLength(screen.length() - 1);
                    }
                } else {
                    screen.append(c);
                }
            }

            System.out.println(screen.toString());
        }
    }
}
