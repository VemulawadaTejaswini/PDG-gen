import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
 
public class Main {
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        while (true) {
            final int N = sc.nextInt();
            final int M = sc.nextInt();
            final int L = sc.nextInt();
            final int K = sc.nextInt();
            final int A = sc.nextInt();
            final int H = sc.nextInt();
             
            if(N == 0 && M == 0 && L == 0 && K == 0 && A == 0 && H == 0){
                break;
            }
             
            System.gc();
            
            Set<Integer> cool = new HashSet<Integer>(L);

             
            for(int i = 0; i < L; i++){
                cool.add(sc.nextInt());
            }
            cool.add(A);
            cool.add(H);
             
            int[][] adj = new int[N][N];
            
            final int max = Integer.MAX_VALUE / 128;
            
            for(int i = 0; i < N; i++){
        		for(int j = 0; j < N; j++){
        			adj[i][j] = i == j ? 0 : max;
        		}
            }
            
            for(int i = 0; i < K; i++){
                final int from = sc.nextInt();
                final int to = sc.nextInt();
                final int cost = sc.nextInt();
                 
                adj[from][to] = adj[to][from] = cost;
            }
            
            for(int k = 0; k < N; k++){
            	for(int i = 0; i < N; i++){
            		for(int j = 0; j < N; j++){
            			adj[i][j] = Math.min(adj[i][j], adj[i][k] + adj[k][j]);
            		}
            	}
            }
            
            for(int i = 0; i < N; i++){
            	for(int j = 0; j < N; j++){
            		if(!cool.contains(i) || !cool.contains(j)){
            			adj[i][j] = max;
            		}else if(adj[i][j] > M){
            			adj[i][j] = max;
            		}
            	}
            }
            
            for(int k = 0; k < N; k++){
            	for(int i = 0; i < N; i++){
            		for(int j = 0; j < N; j++){
            			adj[i][j] = Math.min(adj[i][j], adj[i][k] + adj[k][j]);
            		}
            	}
            }
            
            System.out.println(adj[A][H] >= max ? "Help!" : adj[A][H] + Math.max(0, adj[A][H] - M));
        }
 
        sc.close();
    }
 
}