import java.util.Scanner;

class Main{
      public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int[][][] count = new int[4][3][10];

    	int n = scan.nextInt();
    	int[] b = new int[n];
    	int[] f = new int[n];
    	int[] r = new int[n];
    	int[] v = new int[n];
    	
    	for(int i = 0; i < n; i++){
    		b[i] = scan.nextInt();
    		f[i] = scan.nextInt();
    		r[i] = scan.nextInt();
    		v[i] = scan.nextInt();
    	}
    	
    	for(int i = 0; i < n; i++){
    		count[b[i] - 1][f[i] - 1][r[i] - 1] += v[i];
    	}
    	
    	for(int k = 0; k < 4; k++){
    		for(int j = 0; j < 3; j++){
    			for(int i = 0; i < 10; i++){
    				System.out.print(" " + count[k][j][i]);
    	    	}	
    			System.out.println("");
        	}
    		if(k != 3)System.out.println("####################");
    	}
    }
}