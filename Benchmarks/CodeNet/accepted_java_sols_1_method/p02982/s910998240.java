import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int D = sc.nextInt();

        int[][] arr1 = new int[N][D];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < D; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        int count = 0;
        int temp = 0;

        for (int i = 0; i < N-1; i++) {
            for (int k = 1; k < N - i; k++) {
                for (int j = 0; j < D; j++) {
                    temp += Math.pow(Math.abs(arr1[i][j] - arr1[i+k][j]), 2);
                }
                double temp_s = Math.sqrt(temp);
                    if (temp_s == (int)temp_s) {
                        count++;
                    }
                    temp = 0;
            }
        }
        System.out.println(count);
    }
}