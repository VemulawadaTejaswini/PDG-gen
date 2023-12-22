import java.util.Scanner;

class Main{

    public static void main(String[] args){

	Scanner in = new Scanner(System.in);

	while(true){
	int n = in.nextInt();
	if(n == 0)break;       

	int[][] mat = new int[50][50]; 
	int[] ato = new int[50];
	int[] tap = new int[50];

	

	for(int i=0;i<50;i++){
	    ato[i]=0;
	    tap[i]=0;
	}


	for(int i=0;i<n;i++){
	    for(int j=0;j<n;j++){
		mat[i][j] = in.nextInt();
		ato[i] += mat[i][j];
		tap[j] += mat[i][j];
	    }
	}
	for(int i=0;i<n;i++)ato[n] += ato[i];



	for(int i=0;i<=n;i++){
	    for(int j=0;j<=n;j++){
		if(i<n && j<n){
		    System.out.printf("%5d",mat[i][j]);
		}
		else if(j == n){
		    System.out.printf("%5d",ato[i]);
		}
		else if(i == n){
		    System.out.printf("%5d",tap[j]);
		}

	    }
	    System.out.printf("\n");
	}
	

	}




    }



}