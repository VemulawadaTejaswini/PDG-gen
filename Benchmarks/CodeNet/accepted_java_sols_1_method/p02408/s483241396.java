import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean[][] cards = new boolean[4][13];
        for (int i = 0; i < n; i++) {
            String mark = input.next();
            int no = input.nextInt();
            char c = mark.charAt(0);
            if (c == 'S')
                cards[0][no - 1] = true;
            else if (c == 'H')
                cards[1][no - 1] = true;
            else if (c == 'C')
                cards[2][no - 1] = true;
            else if (c == 'D')
                cards[3][no - 1] = true;
        }
        for (int i = 0; i < 4; i++) {
            char mark = 0;
            if (i == 0) mark = 'S';
            else if (i == 1) mark = 'H';
            else if (i == 2) mark = 'C';
            else if (i == 3) mark = 'D';
            for (int j = 0; j < 13; j++) {
                if (cards[i][j] == false) {
                    System.out.println(String.format("%c %d", mark, j + 1));
                }
            }
        }
    }
}