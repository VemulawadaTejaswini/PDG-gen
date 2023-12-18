import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] foods = new int[M];
        
        for(int i = 0; i < N; i++){
            
            int K = sc.nextInt();
            for(int j = 0; j < K; j++){
                int A = sc.nextInt() - 1;
                foods[A]++;
            }
        }
        
        int ans = 0;
        for(int i = 0; i < M; i++){
            if( foods[i] == N ) ans++;
        }
        
        System.out.println(ans);
    }
}
