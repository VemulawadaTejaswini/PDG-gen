import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.ArrayDeque;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[M];
        int[] B = new int[M];
        int[][] d = new int[N + 1][N + 1];

        for(int i=0; i<M; i++){
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
            d[A[i]][B[i]] = 1;
            d[B[i]][A[i]] = 1;
        }

        ArrayDeque<Integer> que = new ArrayDeque<>();
        boolean[] memo = new boolean[N + 1];
        que.add(1);
        memo[1] = true;
        int[] ans = new int[N + 1];
        while(!que.isEmpty()){
            int p = que.pop();
            for(int i=1; i<=N; i++){
                if(d[p][i]==1 && !memo[i]){
                    que.add(i);
                    ans[i] = p;
                    memo[i] = true;
                }
            }
        }

        for(int i=1; i<=N; i++){
            if(!memo[i]){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        for(int i=2; i<=N; i++){
            System.out.println(ans[i]);
        }
    }
}