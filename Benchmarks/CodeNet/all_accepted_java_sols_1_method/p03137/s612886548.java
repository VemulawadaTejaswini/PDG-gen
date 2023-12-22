import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] X = new int[M];
        for(int i = 0; i < M; i++){
            X[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(X);
        int[] dis = new int[M-1];
        for(int i = 0; i < M-1; i++){
            dis[i] = X[i+1] - X[i];
        }
        Arrays.sort(dis);
        int ans = X[M-1] - X[0];
   
        if(N>=M)
            System.out.println(0);
        else{
            for(int i = 0; i < N-1; i++){
                ans -= dis[M-2-i];
            }
            System.out.println(ans);
        }
    }
}
