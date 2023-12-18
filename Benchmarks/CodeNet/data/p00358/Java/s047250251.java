import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), n = sc.nextInt(), result = 0;

        int[][] track = new int[4][h];
        for(int i = 0; i < n; i++) {
            track[sc.nextInt()][sc.nextInt()] = 1;
        }

        for(int i = 0; i <= 2; i++) {
            for(int j = 0; j <= h - 2; j++) {
                if(track[i][j] + track[i + 1][j] + track[i][j + 1] + track[i + 1][j + 1] == 0) {
                    result++;
                    track[i][j] = 1;
                    track[i + 1][j] = 1;
                    track[i][j + 1] = 1;
                    track[i + 1][j + 1] = 1;
                }
            }
        }
        System.out.println(result);
    }
}