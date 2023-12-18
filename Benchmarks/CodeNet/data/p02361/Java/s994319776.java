import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int V = in.nextInt();
        int E = in.nextInt();
        int r =  in.nextInt();
        
        int a[][] = new int[V][V];
        
        for (int i = 0; i < V; i++){
            for (int j = 0; j < V; j++){
                a[i][j] =  -1;
            }
        }
        
        for (int i = 0; i < E; i++){
            int s = in.nextInt();
            int t = in.nextInt();
            int d = in.nextInt();
                a[s][t] = d;
        }
        
        int[] distance = new int[V];
        dijkstra(a,r,distance);
        for (int i = 0; i < V; i++){
            if (distance[i]==Integer.MAX_VALUE) {
                System.out.print("INF");
            } else {
                System.out.println(distance[i]);
            }
        }
    }
    
    public static void dijkstra(int[][] map,int src,int[] distance) {
        int V = distance.length;
	    boolean[] fixed = new boolean[V]; 
        for (int i=0; i<V; i++) {
            distance[i] = Integer.MAX_VALUE;
            fixed[i] = false;
        }
        distance[src] = 0;
        while (true) {
            int marked = minIndex(distance,fixed);
            if (marked < 0) return; 
            if (distance[marked]==Integer.MAX_VALUE) return;
            fixed[marked] = true; 
            for (int j=0; j<V; j++) { 
                if (map[marked][j]>0 && !fixed[j]) {
                    
                    int newDistance = distance[marked]+map[marked][j];
                    
                    if (newDistance < distance[j]) distance[j] = newDistance;
                }
            }
        }
    }
    
    static int minIndex(int[] distance,boolean[] fixed) {
        int idx=0;
        for (; idx<fixed.length; idx++)	
            if (!fixed[idx]) break;
	    if (idx == fixed.length) return -1; 
        for (int i=idx+1; i<fixed.length; i++) 
            if (!fixed[i] && distance[i]<distance[idx]) idx=i;
        return idx;
    }
    
}