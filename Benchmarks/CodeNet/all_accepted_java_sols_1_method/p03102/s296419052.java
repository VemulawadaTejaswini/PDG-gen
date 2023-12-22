import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int C = sc.nextInt();

        int[] B = new int[M];
        for(int i = 0; i < M; i++){
            B[i] = sc.nextInt();
        }
        
        int ans = 0;
        for(int i = 0; i < N; i++){
            int sum = C;
            for(int j = 0; j < M; j++){
                int A = sc.nextInt();
                sum += A * B[j];
            }
            if ( sum > 0 ) ans++;
        }
        
        System.out.println(ans);
    }
}
