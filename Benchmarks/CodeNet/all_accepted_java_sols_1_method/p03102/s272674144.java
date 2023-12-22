import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int C = sc.nextInt();
        
        int[] B_array = new int[M];
        for(int i = 0; i < M; i++){
            B_array[i] = sc.nextInt();
        }
        
        int ans = 0;
        for(int i = 0; i < N; i++){
            int total = C;
            for(int j = 0; j < M; j++){
                int Aij = sc.nextInt();
                total += Aij * B_array[j];
            }
            if(total > 0){
                ans++;
            }
        }
        
        System.out.println(ans);
    }
}