import java.lang.Math;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String S = scanner.nextLine();

        final char[] order1 = { '0', '1' };
        final char[] order2 = { '1', '0' };

        int count1 = 0;
        int count2 = 0;

        final int n = S.length();
        for (int i = 0; i < n; i++) {
            int c = S.charAt(i);
            int c1 = order1[i % 2];
            int c2 = order2[i % 2];
            if (c1 != c) {
                count1++;
            }
            if (c2 != c) {
                count2++;
            }
        }

        System.out.println(Math.min(count1, count2));
    }
}
