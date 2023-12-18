import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] field = new char[h][];
        int[][] orbs = new int[h + 1][w + 1];
        int[][] ingots = new int[h + 1][w + 1];
        for (int i = 0; i < h; i++) {
            field[i] = sc.next().toCharArray();
            for (int j = w - 1; j >= 0; j--) {
                orbs[i][j] = orbs[i][j + 1];
                if (field[i][j] == 'O') {
                    orbs[i][j]++;
                }
            }
        }
        for (int j = 0; j < w; j++) {
            for (int i = h - 1; i >= 0; i--) {
                ingots[i][j] = ingots[i + 1][j];
                if (field[i][j] == 'I') {
                    ingots[i][j]++;
                }
            }
        }
        long total = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (field[i][j] == 'J') {
                    total += orbs[i][j] * ingots[i][j];
                }
            }
        }
        System.out.println(total);
    }
}
