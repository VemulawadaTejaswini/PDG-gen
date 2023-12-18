import java.util.*;
public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[][] adj_M = new int[n][n];
	int i,j;
	for(i = 0; i < n; i++){
	    int u = sc.nextInt();
	    int k = sc.nextInt();
	    if(k > 0){
		for(j = 0; j < k; j++){
		    int v = sc.nextInt();
		    adj_M[u-1][v-1] = 1;
		}
	    }
	}
	for(i = 0; i < n; i++){
	    for(j = 0; j < n; j++){
		System.out.print(adj_M[i][j] + " ");
		if(j == n-1)
		    System.out.println();
	    }
	}
    }
}
