import java.util.Scanner;

public class Main{
    public static void main(String[] args){

	final int N = 100;
	int[][] M = new int[N][N];

	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();

	for(int i = 0; i < n; i++){
	    for(int j = 0; j < n; j++){
		M[i][j] = 0;
	    }
	}
	for(int i = 0; i < n; i++){
	    int u  = scan.nextInt();
	    int k = scan.nextInt();
	    u--;
	    for(int j = 0; j < k; j++){
		int v = scan.nextInt();
		v--;
		M[u][v] = 1;
	    }
	}
	for(int i = 0; i < n; i++){
	    for(int j = 0; j < n; j++){
		System.out.print(M[i][j]);
		if(j < n-1) System.out.print(" ");
	    }
	    System.out.println();
	}
    }
}


