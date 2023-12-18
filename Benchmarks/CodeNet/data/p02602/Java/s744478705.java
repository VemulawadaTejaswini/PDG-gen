import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        s = scanner.nextLine().split(" ");
        int an[] = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            an[i] = Integer.parseInt(s[i]);
        }

        long prevScore = 1;
        for (int i = k; i <= n; i++) {
            long score = an[i - 1];
            for (int j = 1; j < k; j++) {
                if (0 <= i - j - 1) {
                    score *= an[i - j - 1];
                }
            }
            if (k < i) {
                if (prevScore < score) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
            prevScore = score;
        }
        scanner.close();
    }
}
