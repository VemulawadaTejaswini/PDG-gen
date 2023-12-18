import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	int n=Integer.parseInt(br.readLine());

	int matrix[][]=new int[n][n];

	for(int i=0;i<n;i++){
	    String str[]=br.readLine().split(" ");

	    int u=Integer.parseInt(str[0])-1;
	    int k=Integer.parseInt(str[1]);
	    for(int j=2;j<2+k;j++){
		int v=Integer.parseInt(str[j])-1;
		matrix[u][v]=1;
	    }
	}

	int dist[]=bfs(matrix,n,0);

	for(int i=0;i<n;i++){
	    System.out.println((i+1)+" "+dist[i]);
	}
	
    }
    static int[] bfs(int matrix[][],int n,int s){
	boolean used[]=new boolean[n];
	int dist[]=new int[n];

	Arrays.fill(dist,-1);

	Queue<Integer> q=new ArrayDeque<>();

	used[s]=true;
	dist[s]=0;
	q.add(s);

	while(!q.isEmpty()){
	    int now=q.poll();

	    for(int i=0;i<n;i++){
		if(matrix[now][i]==1&&!used[i]){
		    used[i]=true;
		    dist[i]=dist[now]+1;
		    q.add(i);
		}
	    }
	}
	return dist;
    }
}

