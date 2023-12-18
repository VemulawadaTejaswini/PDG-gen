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
            final char[] cards = new char[10];
            for (int j = 0; j < 10; j++) {
                cards[j] = scanner.next().charAt(0);
            }
            final int[] hand = new int[10];
            hand[0] = toInt(cards[0]);
            int index = 1;
            int score = 0;
            for (; index < 10; index++) {
                hand[index] = toInt(cards[index]);
                boolean[] flag = new boolean[1];
                score = calcScore(hand, index + 1, flag);
                if (!(score < 17 || (score == 17 && flag[0]))) {
                    break;
                }
            }
            if (score > 21) {
                System.out.println("bust");
            } else if (score == 21 && index == 1) {
                System.out.println("blackjack");
            } else {
                System.out.println(score);
            }
        }
    }

    public static void main(String... args) {
        solve();
    }
}