import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int C = sc.nextInt();
        int B[] = new int[M];
        for(int i=0; i<M; i++) {
            B[i] = sc.nextInt();
        }
        int A[][] = new int[N][M];
        for(int s=0; s<N; s++) {
            for(int i=0; i<M; i++) {
                A[s][i] = sc.nextInt();
            }
        }
        int r = 0;
        for(int s=0; s<N; s++) {
            int score = C;
            for(int i=0; i<M; i++) {
                score += B[i] * A[s][i];
            }
            if(score>0) r++;
        }
        System.out.println(r);
   }
}