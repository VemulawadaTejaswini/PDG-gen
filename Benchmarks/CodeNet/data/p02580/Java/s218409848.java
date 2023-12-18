import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        int m = sc.nextInt();

        boolean[][] field = new boolean[h][w];
        int[] hcount = new int[h];
        int[] wcount = new int[w];

        for (int i = 0; i < m; i++) {
            int h1 = sc.nextInt() - 1;
            int w1 = sc.nextInt() - 1;
            field[h1][w1] = true;
            hcount[h1]++;
            wcount[w1]++;
        }


        int hmax = 0;
        for (int i = 0; i < h; i++) {
            hmax = Math.max(hmax, hcount[i]);
        }
        int wmax = 0;
        for (int i = 0; i < w; i++) {
            wmax = Math.max(wmax, wcount[i]);
        }

        for (int i = 0; i < h; i++) {
            if(hcount[i] != hmax){
                continue;
            }
            for (int j = 0; j < w; j++) {
                if(wcount[j] != wmax){
                    continue;
                }
                if(!field[i][j]){
                    System.out.println(hmax + wmax);
                    return;
                }
            }
        }

        System.out.println(hmax + wmax - 1);
        //printBooleanArray(field);


    }

    static void printBooleanArray(boolean[][] array, int y, int x, int h, int w) {
        char t = '#';
        char f = '.';
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                boolean element = array[y + i][x + j];
                if (element) {
                    sb.append("\u001b[00;40m");
                    sb.append(t);
                    sb.append("\u001b[00m");
                } else {
                    sb.append(f);
                }
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    static void printBooleanArray(boolean[][] array) {
        printBooleanArray(array, 0, 0, array.length, array[0].length);
    }
}
