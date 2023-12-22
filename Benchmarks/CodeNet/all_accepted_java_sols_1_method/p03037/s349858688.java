import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] L = new int[M];
        int[] R = new int[M];
        
        int resL = 1;
        int resR = N;
        
        for(int i = 0; i < M; i++){
            L[i] = sc.nextInt();
            R[i] = sc.nextInt();
            
            resL = Math.max(resL, L[i]);
            resR = Math.min(resR, R[i]);
        }

        System.out.println( Math.max(resR - resL + 1, 0) );

    }
}
