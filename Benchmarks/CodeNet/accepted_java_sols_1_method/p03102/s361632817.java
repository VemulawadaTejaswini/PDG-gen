import java.util.Scanner;

// 5
public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int C = sc.nextInt();

        int[] B = new int[M];
        int[][] A = new int[N][M];
        
        for(int i = 0; i < M; i++)
        	B[i] = sc.nextInt();
        for(int i = 0; i < N; i++)
        	for(int j = 0; j < M; j++)
        		A[i][j] = sc.nextInt();

        int ans = 0;
        for(int i = 0; i < N; i++) {
            int ans_pat = 0;
            for(int j = 0; j < M; j++)
                ans_pat += A[i][j] * B[j];

            if(ans_pat + C > 0) ++ans;
        }

        System.out.println(ans);
    }

}
