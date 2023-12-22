import java.util.*;
public class Main {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] A = new int[2][N];
        for (int i = 0; i < N; i++) {
            A[0][i] = scanner.nextInt();
        }
        for (int i = 0; i < N; i++) {
            A[1][i] = scanner.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            int score = 0;
            for (int j = 0; j < N; j++) {
                if(j<i) score += A[0][j];
                else if(i==j) score += A[0][j] + A[1][j];
                else if(i<j) score += A[1][j];
            }
            ans = Math.max(ans,score);
        }
        System.out.println(ans);
    }
}