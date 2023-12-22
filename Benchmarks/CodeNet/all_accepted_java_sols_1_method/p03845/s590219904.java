import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = Integer.parseInt(sc.next());
        
        int[] T = new int[N];
        for(int i=0; i<N; i++){
            T[i] = Integer.parseInt(sc.next());
        }
        
        int M = Integer.parseInt(sc.next());
        
        for(int i=0; i<M; i++){
            int p = Integer.parseInt(sc.next());
            int x = Integer.parseInt(sc.next());
            
            int ans = 0;
            for(int j=0; j<N; j++){
                if(j == p-1){
                    ans += x;
                }else{
                    ans += T[j];
                }
            }
            
            System.out.println(ans);
        }
    }
}