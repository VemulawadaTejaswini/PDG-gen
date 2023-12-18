import java.util.Scanner;


public class Main {
    static Scanner s = new Scanner(System.in);
    static char[][] map = new char[8][8];
    static char[] player = {'o', 'x'};

    public static void main(String[] args) {
        scanMap();
        while (true) {
            int o = playTurn(0);
            int x = playTurn(1);

            if (o == 0 && x == 0) break;
        }
        printMap();
    }

    static void scanMap() {
        for (int i = 0; i < 8; i++) {
            String st = s.next();
            for (int j = 0; j < 8; j++)
                map[i][j] = st.charAt(j);
        }
    }

    static void printMap() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++)
                System.out.print(map[i][j]);
            if (i < 7)
                System.out.println();
        }
    }

    static int checkPlace(int turn, int i, int j, int mode) {
        int score = 0;
        int opturn = turn + 1;
        if (opturn == 2) opturn = 0;

        if (map[i][j] != '.') return 0;

        for (int n = i - 1; n <= i + 1; n++) {
            for (int m = j - 1; m <= j + 1; m++) {
                if (n < 0 || 7 < n || m < 0 || 7 < m) continue;
                if (map[n][m] == player[opturn]) {
                    score += scoreCount(i, j, n - i, m - j, turn, mode);
                }
            }
        }
        return score;
    }

    static int scoreCount(int i, int j, int imove, int jmove, int turn, int mode) {
        int score = 0;
        int opturn = turn + 1;
        if (opturn == 2) opturn = 0;
        int n = i;
        int m = j;

        while (true) {
            i += imove;
            j += jmove;
            if (i < 0 || 7 < i || j < 0 || 7 < j) return 0;
            if (map[i][j] == player[opturn]) {
                score++;
            } else if (map[i][j] == player[turn]) {
                if (mode == 1) {
                    while (i != n || j != m) {
                        i -= imove;
                        j -= jmove;
                        map[i][j] = player[turn];
                    }
                }
                return score;
            } else {
                return 0;
            }
        }
    }

    static int playTurn(int turn) {
        int maxScore = 0;
        int n = 0, m = 0;

        if (turn == 0) {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    int score = checkPlace(turn, i, j, 0);
                    if (maxScore < score) {
                        maxScore = score;
                        n = i;
                        m = j;
                    }
                }
            }
        } else {
            for (int i = 7; i > -1; i--) {
                for (int j = 7; j > -1; j--) {
                    int score = checkPlace(turn, i, j, 0);
                    if (maxScore < score) {
                        maxScore = score;
                        n = i;
                        m = j;
                    }
                }
            }
        }

        if (maxScore != 0) {
            changeMap(n, m, turn);
            map[n][m] = player[turn];
        }
        return maxScore;
    }

    static void changeMap(int i, int j, int turn) {
        int score = checkPlace(turn, i, j, 1);
    }
}