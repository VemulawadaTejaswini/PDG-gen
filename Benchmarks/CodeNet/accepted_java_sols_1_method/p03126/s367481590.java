import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int [][] K = new int [N][M+1];
        int [] count = new int [M];
        int ans = 0;
        
        for(int i=0; i<N; i++){
            K[i][0] =sc.nextInt();
            for(int j=1; j<=K[i][0]; j++){
                K[i][j] = sc.nextInt();
                count[K[i][j]-1]++;
            }
        }
        
        for(int i=0; i<M; i++){
            if(count[i] == N){
                ans++;
            }
        }
        
        System.out.println(ans);
    }
}
