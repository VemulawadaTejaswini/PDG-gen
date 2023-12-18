import java.util.Scanner;

/**
 * Created by kazuki on 2014/07/10.
 */
public class Main{
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int N, Nx, Ny, M, Mmove, x, y, catchNum;
        char Mdir;
        int[][] map = new int[21][21];

        while (true) {
            N = s.nextInt();
            if (N == 0) break;

            x = 10;
            y = 10;
            catchNum = 0;
            for(int i=0;i<21;i++){
                for (int j=0;j<21;j++)
                    map[i][j]=0;
            }

            for (int i = 0; i < N; i++) {
                Nx = s.nextInt();
                Ny = s.nextInt();
                map[Nx][Ny] = 1;
            }

            M = s.nextInt();

            if (map[x][y] == 1) {
                map[x][y] = 0;
                catchNum++;
            }

            for (int i = 0; i < M; i++) {
                Mdir = s.next().charAt(0);
                Mmove = s.nextInt();

                switch (Mdir) {
                    case 'N':
                        for (int j = 0; j < Mmove; j++) {
                            y++;
                            if (map[x][y] == 1) {
                                map[x][y] = 0;
                                catchNum++;
                            }
                        }
                        break;
                    case 'S':
                        for (int j = 0; j < Mmove; j++) {
                            y--;
                            if (map[x][y] == 1) {
                                map[x][y] = 0;
                                catchNum++;
                            }
                        }

                        break;
                    case 'E':
                        for (int j = 0; j < Mmove; j++) {
                            x++;
                            if (map[x][y] == 1) {
                                map[x][y] = 0;
                                catchNum++;
                            }
                        }
                        break;
                    case 'W':
                        for (int j = 0; j < Mmove; j++) {
                            x--;
                            if (map[x][y] == 1) {
                                map[x][y] = 0;
                                catchNum++;
                            }
                        }
                        break;
                }
            }

            if (N == catchNum) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}