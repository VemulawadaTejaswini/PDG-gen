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
        for (int i = 0; i < k; i++) {
            prevScore *= an[k - i - 1];
        }
        long score;
        for (int i = k + 1; i <= n; i++) {
            score = prevScore / an[i - k - 1] * an[i - 1];
            if (prevScore < score) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            prevScore = score;
        }
        scanner.close();
    }
}
