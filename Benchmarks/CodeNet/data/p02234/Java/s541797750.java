import java.util.Scanner;

class Main{
    static int[][] costs = new int[105][105];
    static int[] matrix = new int[105];
    static int length;

    public static void main(String[] args){
	Scanner read = new Scanner(System.in);
	int j=0;

	//make matrix
	length = read.nextInt();
	for(int i=0; i<length; i++){
	    matrix[i] = read.nextInt();
	    j=read.nextInt();
	}
	matrix[length]=j;

	/*for(int i=0; i<=length; i++)System.out.print(" "+matrix[i]);
	  System.out.println();*/
	matrixChainOrder();
	//print
	/*
	for(int i=0; i<=length; i++){
	    for(int k=0; k<=length; k++){
		System.out.print(costs[i][k]+" ");
	    }
	    System.out.println();
	}
	*/
	System.out.println(costs[1][length]);

    }

    static void matrixChainOrder(){
	int n = length;
	int j;
	int q;

	for(int i=1; i<=n; i++)costs[i][i]=0;

	for(int l=2; l<=n; l++){
	    for(int i=1; i<=n-l+1; i++){
		j=i+l-1;
		costs[i][j] = Integer.MAX_VALUE;
		
		for(int k=i; k<=j-1; k++){
		    q=costs[i][k]+costs[k+1][j]+matrix[i-1]*matrix[k]*matrix[j];
		    //System.out.println("aaaaa "+q);
		    costs[i][j] = Math.min(costs[i][j], q);
		}
		
	    }
	}
    }
}