import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[][] x = new int[n][d];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                x[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double sum = 0;
                for (int k = 0; k < d; k++) {
                    sum += Math.pow(Math.abs(x[i][k] - x[j][k]), 2);
                }
                for (int k = 1; k <= sum; k++) {
                    if (Math.pow(k, 2) > sum) {
                        break;
                    }
                    if (Math.pow(k, 2) == sum) {
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
