import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<Integer>();

        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] B = new int[r+1][c+1];

        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                B[i][j] = sc.nextInt();
                B[i][c] += B[i][j];
                B[r][j] += B[i][j];
                B[r][c] += B[i][j];
            }
        }
        for (int i=0; i<r+1; i++) {
            for (int j=0; j<c+1; j++) {
                System.out.print(B[i][j]);
                if (j != c)
                    System.out.print(" ");
                else
                    System.out.println();
            }
        }


    }
}
