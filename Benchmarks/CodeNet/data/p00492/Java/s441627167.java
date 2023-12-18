import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int[][] field = new int[h + 2][w + 2];
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                field[i][j] = sc.nextInt();
            }
        }
        search(0, 0, field);
        long count = 0;
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                if (field[i][j] == 1) {
                    if (field[i - 1][j] == -1) {
                        count++;
                    }
                    if (field[i][j - 1] == -1) {
                        count++;
                    }
                    if (field[i][j + 1] == -1) {
                        count++;
                    }
                    if (field[i + 1][j] == -1) {
                        count++;
                    }
                    if (i % 2 == 1) {
                        if (field[i - 1][j + 1] == -1) {
                            count++;
                        }
                        if (field[i + 1][j + 1] == -1) {
                            count++;
                        }
                    } else {
                        if (field[i - 1][j - 1] == -1) {
                            count++;
                        }
                        if (field[i + 1][j - 1] == -1) {
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
    
    static void search(int hh, int ww, int[][]field) {
        if (hh < 0 || hh >= field.length || ww < 0 || ww >= field[hh].length) {
            return;
        }
        if (field[hh][ww] != 0) {
            return;
        }
        field[hh][ww] = -1;
        search(hh - 1, ww, field);
        search(hh, ww - 1,  field);
        search(hh, ww + 1, field);
        search(hh + 1, ww, field);
        if (hh % 2 == 1) {
            search(hh - 1, ww + 1, field);
            search(hh + 1, ww + 1, field);
        } else {
            search(hh - 1, ww - 1, field);
            search(hh + 1, ww - 1, field);
        }
    }
}

