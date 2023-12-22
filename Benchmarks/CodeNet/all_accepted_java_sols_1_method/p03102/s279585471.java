import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int C = scan.nextInt();
        int[] B = new int[M];
        for(int i = 0; i<M; i++){
            B[i] = scan.nextInt();
        }

        int count = 0;
        int[][] A = new int[N][M];
        for(int row = 0; row < N; row++){
            for(int col = 0; col < M; col++){
                A[row][col] = scan.nextInt();
            }

            int sum = 0;
            for(int i = 0; i < M; i++){
                sum += A[row][i] * B[i];
            }
            sum += C;

            if(sum > 0){
                count++;
            }
        }

        System.out.print(count + "\n");
    }

    
}