import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	while(true){
    		int row = input.nextInt();
	    	int col = input.nextInt();
	    	if(row == 0 && col == 0)break;
	    	for(int i = 0 ; i < row ; i++){
	    		for(int j = 0 ; j < col ; j++){
	    			if((i+j) % 2 == 0){
	    				System.out.print("#");
	    			}else{
	    				System.out.print(".");
	    			}
	    		}
	    		System.out.println();
	    	}
	    	System.out.println();
    	}
    }
}