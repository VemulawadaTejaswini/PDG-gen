import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] h = new int[N + 1];

        for(int i=0; i<N; i++){
            h[i] = sc.nextInt();
        }

        h[N] = 0;

        int ans = 0;
        int sum = 0;
        for(int i=0; i<=100; i++){
            for(int j=0; j<=N; j++){
                if(j>0 && h[j]==0 && h[j-1]!=0){
                    sum++;
                }
            }
            for(int j=0; j<=N; j++){
                if(h[j]!=0){
                    h[j]--;
                }
            }
            ans += sum;
            sum = 0;
        }
        System.out.println(ans);
    }
}