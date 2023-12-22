import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int cards[] = new int[n];
        Arrays.fill(cards, 0);
        for (int i = 0; i < m; i++) {
            int l = in.nextInt() - 1;
            int r = in.nextInt() - 1;

            cards[l]++;
            if (r + 1 < n) {
                cards[r + 1]--;
            }
        }

        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            cards[i + 1] += cards[i];
            if (cards[i + 1] == m) count++;
        }
        if (cards[0] == m) count++;

        System.out.println(count);
    }
}
