import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {
    private static void solve() {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            String string = scanner.next();
            if (string.equals("#")) {
                break;
            }
            int counter = 0;
            int previous = 0;
            final Set<Character> left = new HashSet<Character>();
            final Set<Character> right = new HashSet<Character>();
            Collections.addAll(left, 'q', 'w', 'e', 'r', 't',
                                     'a', 's', 'd', 'f', 'g',
                                     'z', 'x', 'c', 'v', 'b');
            for (char c : string.toCharArray()) {
                if (left.contains(c)) {
                    if (previous == -1) {
                        counter++;
                    }
                    previous = 1;
                } else {
                    if (previous == 1) {
                        counter++;
                    }
                    previous = -1;
                }
            }
            System.out.println(counter);
        }
    }

    public static void main(String... args) {
        solve();
    }
}