import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            //0:??? 1:?????? 2:??? 3:??????
            int x = 0;
            int y = 0;
            int s = 0;
            int[][] list = new int[n][n];
            for (int i = 0; i < n * n; i++) {
                list[y][x] = i + 1;
                switch (s) {
                case 1:
                    x--;
                case 2:
                    y++;
                    break;
                case 3:
                    y--;
                case 0:
                    x++;
                    break;
                }
                if (y == 0 && x != n - 1 && s == 3 || y == n - 1 && s == 1) {
                    s = 0;
                } else if (y == 0 && s == 0 || x == n - 1 && s == 2) {
                    s = 1;
                } else if (x == 0 && y != n - 1 && s == 1 || x == n - 1 && s == 3) {
                    s = 2;
                } else if (x == 0 && s == 2 || y == n - 1 && s == 0) {
                    s = 3;
                }
            }
            count++;
            System.out.println("Case " + count + ":");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("%3d", list[i][j]);
                }
                System.out.println();
            }

        }
    }
}