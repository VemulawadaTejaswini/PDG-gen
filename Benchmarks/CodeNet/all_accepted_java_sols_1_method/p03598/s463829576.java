import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        
        int ans = 0;
        for(int i=0; i<N; i++){
            int x = Integer.parseInt(sc.next());
            
            int A = 2 * x;
            int B = 2 * (K - x);
            
            if(A <= B){
                ans += A;
            }else{
                ans += B;
            }
        }
        
        System.out.println(ans);
    }
}