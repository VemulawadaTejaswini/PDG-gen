import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] p = new long[2*N+1];
        long D = 0;
        
        for(int i = 0; i < 2*N+1; i++){
            p[i] = sc.nextLong();
        }
        
        for(int i = 0; i < N; i++){
            if(p[i] - p[N+1+i] >= 0){
                D = D + p[N+1+i];
            }else{
                if(p[i+1] - (p[N+1+i] - p[i]) >= 0){
                    D = D + p[N+1+i];
                    p[i+1] = p[i+1] - (p[N+1+i] - p[i]);
                }else{
                    D = D + p[i] + p[i+1];
                    p[i+1] = 0;
                }
            }
        }
        
        System.out.println(D);
    }
}