import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            int n = scanner.nextInt();
            int r = scanner.nextInt();
            if (n == 0 && r == 0) break;
            int cards[] = new int[n];
            for (int i = 0; i < n; i++) {
                cards[i] = n - i;
            }
            for (int i = 0; i < r; i++) {
                int p = scanner.nextInt();
                int c = scanner.nextInt();
                int tmpcards[] = new int[n];
                for (int j = 0; j < n; j++) {
                    tmpcards[j] = cards[j];
                }
                for (int j = 0; j < p - 1; j++) {
                    tmpcards[c + j] = cards[j];
                }
                for (int j = 0; j < c; j++) {
                    tmpcards[j] = cards[p - 1 + j];
                }
                cards = tmpcards;
            }
            System.out.println(cards[0]);
        }
        scanner.close();
    }
}

