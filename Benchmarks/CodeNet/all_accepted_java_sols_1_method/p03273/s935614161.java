import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int h = sc.nextInt(), w = sc.nextInt();
        boolean[][] a = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            String s = sc.next();
            for (int j = 0; j < w; j++) {
                if (s.charAt(j) == '#') {
                    a[i][j] = true;
                }
            }
        }

        List<Integer> skip = new ArrayList<>();
        for (int j = 0; j < w; j++) {
            boolean allWhite = true;
            for (int i = 0; i < h; i++) {
                if (a[i][j]) {
                    allWhite = false;
                    break;
                }
            }
            if (allWhite) {
                skip.add(j);
            }
        }
        for (int i = 0; i < h; i++) {
            boolean allWhite = true;
            for (int j = 0; j < w; j++) {
                if (a[i][j]) {
                    allWhite = false;
                    break;
                }
            }
            if (!allWhite) {
                for (int j = 0; j < w; j++) {
                    if (!skip.contains(j)) {
                        System.out.print(a[i][j] ? '#' : '.');
                    }
                }
                System.out.println();
            }
        }
    }
}