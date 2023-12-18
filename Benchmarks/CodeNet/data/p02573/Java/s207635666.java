import java.util.*;
 
public class Main {
	public static void main (String[] args) {
	  Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int[] rank = new int[n+1];
      int[] parent = new int[n+1];
      
      for(int i= 0; i<=n; i++){
        rank[i] = 1;
        parent[i] = i;
      }
      
      int res = 0;
      for(int i=0; i<m; i++){
          int u = sc.nextInt();
          int v = sc.nextInt();	
          union(u, v, rank, parent);
      }
      for(int curRank : rank) res = Math.max(res, curRank);
      System.out.println(res);
	}
  public static int find(int u, int[] parent){
    if(u != parent[u]){
      parent[u] = find(parent[u], parent);
    }
    return parent[u];
  }
  
  public static void union(int u, int v, int[] rank, int[] parent){
    int parU = find(u, parent);
    int parV = find(v, parent);
    if(parV == parU) return;
    if(rank[parV] > rank[parU]){
      rank[parV] += rank[parU];
      parent[parU] = parV;
      return;
    }
    rank[parU] += rank[parV];
    parent[parV] = parU;
    return;
  }
}