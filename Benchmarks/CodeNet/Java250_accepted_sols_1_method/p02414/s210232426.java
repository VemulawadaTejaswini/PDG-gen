import java.util.Scanner;

class Main{
      public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	int m = scan.nextInt();
    	int l = scan.nextInt();
    	
    	int[][] Vec_A = new int[n][m];
    	int[][] Vec_B = new int[m][l];
    	long[][] Vec_C = new long[n][l];
    	
    	for(int i = 0; i < n; i++){
    		for(int j = 0; j < m; j++){
        		Vec_A[i][j] = scan.nextInt();
        	}
    	}
    	for(int i = 0; i < m; i++){
    		for(int j = 0; j < l; j++){
        		Vec_B[i][j] = scan.nextInt();
        	}
    	}
    	
    	for(int i = 0; i < n; i++){
    		for(int j = 0; j < l; j++){
    			for(int k = 0; k < m; k++){
            		Vec_C[i][j] += Vec_A[i][k] * Vec_B[k][j]; 
            	}
    			
    			if(j != l - 1){
    				System.out.print(Vec_C[i][j] + " ");
    			}else{
    				System.out.println(Vec_C[i][j]);
    			}
        	}
    	}
    }
    	
}