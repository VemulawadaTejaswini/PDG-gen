import java.util.Arrays;
import java.util.Scanner;

class Main {
    private static void solve() {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            int[] colors = new int[n];
            for (int i = 0; i < colors.length; i++) {
                colors[i] = scanner.nextInt();
            }
            Arrays.sort(colors);
            int maximum = 0;
            int maximumColor = -1;
            int index = 0;
            while (index < colors.length) {
                int color = colors[index];
                int counter = 1;
                while (++index < colors.length && colors[index] == color) {
                    counter++;
                }
                if (counter > maximum) {
                    maximum = counter;
                    maximumColor = color;
                }
            }
            if (maximum > colors.length / 2) {
                System.out.println(maximumColor);
            } else {
                System.out.println("NO COLOR");
            }
        }
    }

    public static void main(String... args) {
        solve();
    }
}