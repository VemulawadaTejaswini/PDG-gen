import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            int n = Integer.parseInt(scanner.nextLine());
//            int[] s = new int[n];
//
//            for (int i = 0, p = 0; i < n; i++) {
//
//            }

            String[] s = scanner.nextLine().split(" ");

            int q = Integer.parseInt(scanner.nextLine());
            String[] t = scanner.nextLine().split(" ");

            int count = 0;

            for (String ts : t) {
                int i = Integer.parseInt(ts);
                if (search(s, i, 0, n)) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }

    private static boolean search(String[] s, int i, int left, int right) {
        int half = (left + right) / 2;
        //System.out.printf("%d %d %d %d %s%n", i, left, right, half, s[half]);
        if (half == left || half == right) {
            return false;
        }
        if (i < Integer.parseInt(s[half])) {
            // if (left >= half) {
            //     return false;
            // }
            return search(s, i, left, half);
        } else if (i > Integer.parseInt(s[half])) {
            // if (right <= half) {
            //     return false;
            // }
            return search(s, i, half, right);
        }
        // 一致
        return true;
    }
}

