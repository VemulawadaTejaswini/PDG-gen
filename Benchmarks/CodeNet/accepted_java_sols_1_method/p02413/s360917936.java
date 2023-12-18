import java.util.Scanner;
 
class Main{
	public static void main(String[]args){
        	Scanner sc = new Scanner(System.in);
        	int x = sc.nextInt();
        	int y = sc.nextInt();
        	int table[][] = new int[x+1][y+1];
         
        	for(int i = 0; i < x; i++){
            		for(int j = 0; j < y; j++){
                		table[i][j] = sc.nextInt();
                		table[i][y]+=table[i][j];
                		table[x][j]+=table[i][j];
               			table[x][y]+=table[i][j];
            		}
        	}
     
        	for(int i = 0; i < x+1; i++){
            		for(int j = 0; j < y+1; j++){
                		System.out.print(table[i][j]);
                		if(j != y){
					System.out.print(" ");
				}
            		}
            	System.out.println();
        	}
    	}
}