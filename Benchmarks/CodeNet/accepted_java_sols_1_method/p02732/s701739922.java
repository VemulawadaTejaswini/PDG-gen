import java.util.Scanner;

public class Main {
    public static void main(String[] argv) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        int n = Integer.parseInt(line);

        String ballStr = scanner.nextLine();
        String[] ballStrs = ballStr.split(" ");
        int[] balls = new int[n];
        int i = 0;
        for (String ballS : ballStrs) {
            balls[i++] = Integer.parseInt(ballS);
        }

        long[] map = new long[n + 1];
        for (int ball : balls) {
            map[ball]++;
        }

        long total = 0;

        for (long key : map) {
            if (key > 1) {
                total += key * (key - 1) / 2;
            }
        }

        for (int ball : balls) {
            long count = map[ball];
            System.out.println(total - (count - 1));
        }
    }
}