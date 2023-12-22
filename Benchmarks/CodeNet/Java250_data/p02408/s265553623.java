import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[][] deck = new boolean[4][13];

        Arrays.fill(deck[0], false);
        Arrays.fill(deck[1], false);
        Arrays.fill(deck[2], false);
        Arrays.fill(deck[3], false);

        int n = sc.nextInt();
        while (n-- > 0) {
            switch (sc.next().charAt(0)) {
            case 'S': deck[0][sc.nextInt()-1] = true; break;
            case 'H': deck[1][sc.nextInt()-1] = true; break;
            case 'C': deck[2][sc.nextInt()-1] = true; break;
            case 'D': deck[3][sc.nextInt()-1] = true; break;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                if (deck[i][j] == false) {
                    System.out.print("SHCD".charAt(i));
                    System.out.print(' ');
                    System.out.println(j+1);
                }
            }
        }
    }
}

