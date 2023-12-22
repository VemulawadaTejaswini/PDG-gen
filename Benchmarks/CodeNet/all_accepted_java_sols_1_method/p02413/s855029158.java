import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] t = new int[r+1][c+1];
        
        for (int row = 0; row < r; row++)
            for (int col = 0; col < c; col++)
                t[row][col] = sc.nextInt();

        for (int row = 0; row < r; row++) {
            int sum = 0;
            for (int col = 0; col < c; col++)
                sum += t[row][col];
            t[row][c] = sum;
        }

        for (int col = 0; col <= c; col++) {
            int sum = 0;
            for (int row = 0; row < r; row++)
                sum += t[row][col];
            t[r][col] = sum;
        }

        for (int row = 0; row <= r; row++) {
            for (int col = 0; col <= c; col++)
                System.out.print((col == 0) ? t[row][col] : " " + t[row][col]);
            System.out.println();
        }
    }
}
