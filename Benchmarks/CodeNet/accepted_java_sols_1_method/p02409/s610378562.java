import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][] room = new int[5][4][11];
        int n = sc.nextInt();

        for(int i = 1; i <= 4; i++) {
            for(int j = 1; j <= 3; j++) {
                for(int k = 1; k <= 10; k++) {
                    room[i][j][k] = 0;
                }
            }
        }

        for(int i = 0; i < n; i++) {
            int b = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            room[b][f][r] += sc.nextInt();
        }

        for(int i = 1; i <= 4; i++) {
            for(int j = 1; j <= 3; j++) {
                for(int k = 1; k <= 10; k++) {
                    System.out.print(" " + room[i][j][k]);
                }
                System.out.println();
            }
            if(i == 4) break;
            System.out.println("####################");
        }
    }
}
