import java.util.Scanner;

public class Main{
    Main(){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    int n = sc.nextInt();
	    if(n == 0) break;
	    int[][] ary = new int[n+1][];
	    for(int i = 0; i < n; i++){
		ary[i] = new int[n+1];
		for(int j = 0; j < n; j++){
		    ary[i][j] = sc.nextInt();
		    ary[i][n] += ary[i][j];
		}
	    }

	    ary[n] = new int[n+1];
	    for(int i = 0; i < n; i++)
		for(int j = 0; j < n; j++)
		    ary[n][i] += ary[j][i];


	    for(int i = 0; i < n; i++)
		ary[n][n] += ary[n][i];

	    for(int i = 0; i <= n; i++){
		for(int j = 0; j <= n; j++)
		    System.out.printf("%5d", ary[i][j]);
		System.out.println();
	    }
	}
    }

    public static void main(String[] args){
	new Main();
    }
}