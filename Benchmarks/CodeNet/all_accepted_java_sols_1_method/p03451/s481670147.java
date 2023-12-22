import java.util.Scanner;

/**
 * Created by Santa on 2016/10/16.
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int a[][] = new int[2][N];
        int map[][] = new int[2][N];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < N - 1; i++) {
            a[0][i + 1] += a[0][i];
        }

        a[1][0] += a[0][0];
        for (int i = 0; i < N - 1; i++) {
            a[1][i + 1] += Math.max(a[1][i], a[0][i + 1]);
        }

        System.out.println(a[1][N - 1]);


    }


}

