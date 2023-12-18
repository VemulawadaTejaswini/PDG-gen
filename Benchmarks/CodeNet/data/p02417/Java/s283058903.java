import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] cnt = new int[26];
        while (scanner.hasNext()) {
            String str = scanner.nextLine().toLowerCase();

            for (int i = 0; i < str.length(); ++i) {
                if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                    ++cnt[str.charAt(i) - 'a'];
                }
            }
        }
        for (int i = 0; i < 26; ++i) {
            System.out.printf("%s : %d\n", (char) ('a' + i), cnt[i]);
        }
    }
}
