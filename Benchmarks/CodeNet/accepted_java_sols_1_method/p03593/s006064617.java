import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int c1 = h * w % 2;
        int c2 = h % 2 * w / 2 + w % 2 * h / 2;
        int c4 = (h * w - c2 * 2 - c1) / 4;

        int[] count = new int[26];
        for (int i = 0; i < h; i++) {
            for (char c : scanner.next().toCharArray()) {
                count[c - 'a']++;
            }
        }

        for (int i : count) {
            int j = Math.min(c4, i / 4);
            c4 -= j;
            i -= j * 4;

            j = Math.min(c2, i / 2);
            c2 -= j;
            i -= j * 2;

            c1 -= i;
        }
        System.out.println(c1 == 0 && c2 == 0 && c4 == 0 ? "Yes" : "No");
    }
}