
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int D = scanner.nextInt();

        int[][] X = new int[N][D];

        for (int i = 0 ; i < N ; i++) {
            for (int j = 0 ; j < D ; j++) {
                X[i][j] = scanner.nextInt();
            }
        }
        
        int count = 0;
        for (int i = 0 ; i < N ; i++) {
            for (int j = i + 1 ; j < N ; j++) {
                int dist = 0;
                for (int k = 0 ; k < D ; k++) {
                    dist += (X[i][k] - X[j][k]) * (X[i][k] - X[j][k]);
                }

                for (int n = 1 ; n * n <= dist ; n++) {
                    if (n * n == dist) {
                        count++;
                        break;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
