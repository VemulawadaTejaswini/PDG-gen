import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            int a, b;
            while((a = scn.nextInt()) > 0 | (b = scn.nextInt()) > 0) {
                int[][] field = new int[-~a][-~b];

                for(int[] ary : field) {
                    Arrays.fill(ary, -1);
                }
                for(int i = 0; i <= a; i++) {
                    field[i][0] = 0;
                }
                for(int i = 0; i <= b; i++) {
                    field[0][i] = 0;
                }

                field[1][1] = 1;

                for(int n = scn.nextInt(); n > 0; n--) {
                    field[scn.nextInt()][scn.nextInt()] = 0;
                }

                for(int x = 1; x < field.length; x++) {
                    for(int y = 1; y < field[x].length; y++) {
                        if(field[x][y] < 0) {
                            field[x][y] = field[~-x][y] + field[x][~-y];
                        }
                    }
                }

                System.out.println(field[a][b]);
            }
        }
    }
}