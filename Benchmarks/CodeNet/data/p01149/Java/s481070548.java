import java.util.Scanner;

class Main {
    private static int calcScore(int[] hand, int n, boolean[] flag) {
        boolean ace = false;
        int[] score = new int[2];
        for (int i = 0; i < n; i++) {
            if (hand[i] == 1 && !ace) {
                score[0] += 1;
                score[1] += 11;
                ace = true;
            } else {
                score[0] += hand[i];
                score[1] += hand[i];
            }
        }
        if (score[1] < 22) {
            flag[0] = ace;
            return score[1];
        } else {
            flag[0] = false;
            return score[0];
        }
    }
    private static int toInt(char c) {
        if (Character.isDigit(c)) {
            return c - '0';
        } else {
            switch (c) {
                case 'T':
                case 'J':
                case 'Q':
                case 'K':
                    return 10;
                case 'A':
                    return 1;
            }
        }
        return 0;
    }
    private static void solve() {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            final int[] hand = new int[10];
            hand[0] = toInt(scanner.next().charAt(0));
            hand[1] = toInt(scanner.next().charAt(0));
            for (int j = 2; j < 10; j++) {
                boolean[] flag = new boolean[1];
                final int score = calcScore(hand, j, flag);
                if (score < 17 || (score == 17 && flag[0])) {
                    hand[j] = toInt(scanner.next().charAt(0));
                } else {
                    if (score > 21) {
                        System.out.println("bust");
                    } else if (score == 21 && j == 2) {
                        System.out.println("blackjack");
                    } else {
                        System.out.println(score);
                    }
                    while (j++ < 10) {
                        scanner.next();
                    }
                    break;
                }
            }
        }
    }

    public static void main(String... args) {
        solve();
    }
}