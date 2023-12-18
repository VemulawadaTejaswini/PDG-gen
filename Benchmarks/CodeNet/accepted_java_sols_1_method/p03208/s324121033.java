import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] h = new int[N];
        
        for(int i = 0; i < N; i++){
            h[i] = sc.nextInt();
        }
        
        Arrays.sort(h);
        
        int hmin = Integer.MAX_VALUE;
        for(int i = 0; i < N-K+1; i++){
            int min = h[i];
            int max = h[ i + (K-1) ];
            hmin = Math.min(hmin, max - min);
        }
        
        System.out.println( hmin );
    }
}
