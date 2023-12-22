import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();
		int l = scan.nextInt();
	    int [][] detA = new int [n][m];
	    int [][] detB = new int [m][l];
	    long [][] detC = new long [n][l];

	    for(int i = 0 ; i < detA.length ; i++){
	    	for(int j = 0 ; j < detA[i].length ; j++){
	    		detA[i][j] = scan.nextInt();
	    	}
	    }

	    for(int i = 0 ; i < detB.length ; i++){
	    	for(int j = 0 ; j < detB[i].length ; j++){
	    		detB[i][j] = scan.nextInt();
	    	}
	    }

	    for(int i = 0 ; i < n ; i++){
	    	for(int j = 0 ; j < l ; j++){
	    		for(int k = 0 ; k < m ; k++){
	    			detC[i][j] += detA[i][k]*detB[k][j];
	    		}
	    	}
	    }

	    for(int i = 0 ; i < detC.length ; i++){
	    	for(int j = 0 ; j < detC[i].length ; j++){
	    		System.out.print(detC[i][j]);
                  if(j == detC[i].length -1) continue;
	    		System.out.print(" ");
	    	}
	    	System.out.println();
	    }

	    scan.close();
 	}
}