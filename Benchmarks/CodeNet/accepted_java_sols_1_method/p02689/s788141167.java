import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] H = new int[N + 1];
        int[] A = new int[M];
        int[] B = new int[M];
        boolean[] ngm = new boolean[N + 1];

        for(int i=1; i<=N; i++){
            H[i] = sc.nextInt();
            ngm[i] = true;
        }

        for(int i=0; i<M; i++){
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
            if(H[A[i]]==H[B[i]]){
                ngm[A[i]] = false;
                ngm[B[i]] = false;
            }
            else if(H[A[i]]<H[B[i]]){
                ngm[A[i]] = false;
            }
            else{
                ngm[B[i]] = false;
            }
        }
        int ans = 0;
        for(int i=1; i<=N; i++){
            if(ngm[i]){
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}