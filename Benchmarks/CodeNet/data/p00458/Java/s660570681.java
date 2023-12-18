import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            if (h == 0 && w == 0) {
                break;
            }
            boolean[][] field = new boolean[h][w];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    field[i][j] = (sc.nextInt() == 1);
                }
            }
            int max = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (field[i][j]) {
                        max = Math.max(max, getCount(i, j, field));
                    }
                }
            }
            sb.append(max).append("\n");
        }
        System.out.print(sb);
    }
    
    static int getCount(int h, int w, boolean[][] field) {
        if (h < 0 || h >= field.length || w < 0 || w >= field[0].length || !field[h][w]) {
            return 0;
        }
        int max = 0;
        field[h][w] = false;
        max = Math.max(max, getCount(h - 1, w, field));
        max = Math.max(max, getCount(h + 1, w, field));
        max = Math.max(max, getCount(h, w - 1, field));
        max = Math.max(max, getCount(h, w + 1, field));
        field[h][w] = true;
        return max + 1;
    }
}

