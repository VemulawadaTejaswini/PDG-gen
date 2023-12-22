import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.nextLine();
        
        RollerCoaster rc = new RollerCoaster(N, K);
        
        for(int i = 0; i < N; i++){
            rc.h[i]  = sc.nextInt();
        }
        
        System.out.println(rc.count());
        
    }
}

class RollerCoaster {
    
    int[] h;
    int N;
    int K;
    
    public RollerCoaster(int N, int K){
        this.N = N;
        this.K = K;
        h = new int[N];
    }
    
    public int count() {
        
        int res = 0;
        
        Arrays.sort(h);
        
        int left = -1;
        int right = N;
        
        while(right - left > 1){
            
            int mid = (left + right) / 2;
            if (isOK(mid)) {
                right = mid;
            } else {
                left = mid;
            }
        }
        
        return N - right;
    }
    
    private boolean isOK(int i){
        return h[i] >= K;
    }
    
}
