import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    private static void solve() {
        final Scanner scanner = new Scanner(System.in);
        final Map<String, Integer> counts = new HashMap<String, Integer>();
        final String[] words = scanner.nextLine().split(" ");
        int maximumLength = 0;
        String maximumLengthWord = null;
        int maximumCount = 1;
        String maximumCountWord = null;
        for (String word: words) {
            if (word.length() > maximumLength) {
                maximumLength = word.length();
                maximumLengthWord = word;
            }
            int count;
            if (counts.containsKey(word)) {
                count = counts.get(word) + 1;
            } else {
                count = 1;
            }
            counts.put(word, count);
            if (count > maximumCount) {
                maximumCount = count;
                maximumCountWord = word;
            }
        }
        System.out.print(maximumCountWord);
        System.out.print(" ");
        System.out.print(maximumLengthWord);
        System.out.println();
    }

    public static void main(String... args) {
        solve();
    }
}