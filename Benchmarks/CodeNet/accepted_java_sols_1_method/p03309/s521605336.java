import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
    
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt() - (i+1);
        }
        
        Arrays.sort(A);
        
        long ans = 0;
        for(int i = 0; i < N; i++){
            ans += Math.abs( A[i] - A[N/2] );
        }
        
        System.out.println( ans );
    }
}
