import java.util.Scanner;

class Main{
       public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int r = scan.nextInt();
    	int c = scan.nextInt();
    	int[][] num = new int[r + 1][c + 1];
    	
    	for(int i = 0; i < r; i++){
    		for(int j = 0; j < c; j++){
        		num[i][j] = scan.nextInt();
        	}
    	}
    	
    	for(int i = 0; i < r; i++){
    		for(int j = 0; j < c; j++){
    			num[i][c] += num[i][j];
    		}
    	}
    	for(int j = 0; j < c + 1; j++){
    		for(int i = 0; i < r; i++){
    			num[r][j] += num[i][j];
    		}
    	}
    	
    	for(int i = 0; i < r + 1; i++){
    		for(int j = 0; j < c + 1; j++){
    			if(j != c){
    				System.out.print(num[i][j] + " ");
    			}else{
    				System.out.println(num[i][j]);
    			}
    		}
    	}
    }
}