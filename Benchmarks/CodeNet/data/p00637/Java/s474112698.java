import java.util.Arrays;
import java.util.Scanner;

class Main {
    private static void solve() {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            final int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            int[] pages = new int[n];
            for (int i = 0; i < pages.length; i++) {
                pages[i] = scanner.nextInt();
            }
            Arrays.sort(pages);
            int index = 0;
            while (index < pages.length) {
                int start = index++;
                while (index < pages.length && pages[index - 1] + 1== pages[index]) {
                    index++;
                }
                if (start + 1 < index) {
                    System.out.print(String.format("%d-%d", pages[start], pages[index - 1]));
                } else {
                    System.out.print(pages[start]);
                }
                if (index < pages.length) {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }

    public static void main(String... args) {
        solve();
    }
}