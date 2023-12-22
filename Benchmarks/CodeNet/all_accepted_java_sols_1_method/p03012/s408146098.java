import java.util.*;
import java.lang.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int[] W = new int[N+1];

            for(int i = 1 ; i <= N ; i++){
                W[i] = sc.nextInt();
            }
            sc.close();

            int S1 = 0;
            int S2 = 0;
            int ans = 1000000;
            for(int i = 1 ; i < N ; i++){
                for(int j = 1 ; j <= i ; j++){
                    S1 += W[j];
                }
                for(int k = i+1 ; k <= N ; k++){
                    S2 += W[k];
                }
               // System.out.println(S1-S2);
                ans = Math.min(ans,Math.abs(S1-S2));
                S1 = 0;
                S2 = 0;
            }

            System.out.println(ans);
    }
}

