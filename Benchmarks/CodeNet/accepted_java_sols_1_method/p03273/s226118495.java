import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] map = new char[h][w];
        for (int i = 0; i < h; i++) {
            map[i] = sc.next().toCharArray();
        }

        Set<Integer> ignoreX = new HashSet<>();
        for (int i = 0; i < h; i++) {
            boolean allS = true;
            for (int j = 0; j < w; j++) {
                if (map[i][j] == '#') allS = false;
            }
            if (allS) ignoreX.add(i);
        }

        Set<Integer> ignoreY = new HashSet<>();
        for (int i = 0; i < w; i++) {
            boolean allS = true;
            for (int j = 0; j < h; j++) {
                if (map[j][i] == '#') allS = false;
            }
            if (allS) ignoreY.add(i);
        }

        for (int i = 0; i < h; i++) {
            if (ignoreX.contains(i)) continue;
            for (int j = 0; j < w; j++) {
                if (ignoreY.contains(j)) continue;
                System.out.print(map[i][j]);
            }
            System.out.println("");
        }
    }
}