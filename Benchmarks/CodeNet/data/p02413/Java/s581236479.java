import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt(), c = scn.nextInt();
        int[][] fld = new int[-~r][-~c];
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                fld[i][j] = scn.nextInt();
                fld[r][j] += fld[i][j];
                fld[i][c] += fld[i][j];
                fld[r][c] += fld[i][j];
            }
        }
        for(int i = 0; i < fld.length; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(fld[i][j] + " ");
            }
            System.out.println(fld[i][c]);
        }
    }
}