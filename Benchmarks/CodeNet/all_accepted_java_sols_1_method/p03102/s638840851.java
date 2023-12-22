import java.util.Scanner;

public class Main{
        public static void main(String[] args){
                Scanner scanner = new Scanner(System.in);
                int N = scanner.nextInt();
                int M = scanner.nextInt();
                int C = scanner.nextInt();
                int B[] = new int[M];
                int A[][] = new int[N][M];
                int cnt = 0;

                for (int i = 0; i < M ; i++) {
                        B[i] = scanner.nextInt();
                }

                for (int i = 0; i < N ; i++) {
                        for (int j = 0; j < M ; j++) {
                                A[i][j] = scanner.nextInt();
                        }
                }

                for (int i = 0; i < N ; i++) {
                        int sum = 0;
                        for (int j = 0; j < M ; j++) {
                                sum += A[i][j]*B[j];
                        }
                        if(sum + C > 0){
                                cnt++;
                        }
                }
                System.out.println(cnt);
        }
}