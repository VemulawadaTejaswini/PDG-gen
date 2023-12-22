import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String originalSequence = "";
            while (originalSequence.length() == 0) {
                originalSequence = scanner.nextLine();
            }
            if (originalSequence.equals("-")) {
                break;
            }
            ArrayDeque<Character> chars = new ArrayDeque<Character>();
            for (int i = 0; i < originalSequence.length(); i++) {
                chars.add(originalSequence.charAt(i));
            }
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                int h = scanner.nextInt();
                for (int j = 0; j < h; j++) {
                    chars.add(chars.removeFirst());
                }
            }
            while (chars.size() > 0) {
                System.out.print(chars.removeFirst());
            }
            System.out.println("");
        }
    }
}

