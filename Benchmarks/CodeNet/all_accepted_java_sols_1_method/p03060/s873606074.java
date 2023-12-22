import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int[] V = new int[N];
        int[] C = new int[N];
        for(int i = 0; i < N; i++){
            V[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++){
            C[i] = sc.nextInt();
        }
        
        int total = 0;
        for(int i = 0; i < N; i++){
            if( V[i] - C[i] > 0) total += (V[i] - C[i]);
        }
        
        System.out.println(total);
    }
}
