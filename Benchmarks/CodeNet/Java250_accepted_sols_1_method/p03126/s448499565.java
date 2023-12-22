import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[30]; //食べ物の種類は最大30種類
        int ans = 0;
        
        //食べ物iを好きと答えた人数を種類毎A[i]にカウント
        for(int i = 0; i < N; i++){
            int K = sc.nextInt();
            
            for(int j = 0; j < K; j++){
                A[sc.nextInt() - 1]++;
            }
        }
        
        //N人全てが好きと答えた食べ物の種類数をansでカウント
        for(int i = 0; i < 30; i++){
            if(A[i] == N)ans++;
        }
        
        System.out.println(ans);
    }
}
