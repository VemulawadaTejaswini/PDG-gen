//Volume2-0228
import java.util.Scanner;

public class Main {

    //declare
	private static final int[][] bit = {{0,1,1,1,1,1,1},  // 0
		                                {0,0,0,0,1,1,0},  // 1
		                                {1,0,1,1,0,1,1},  // 2
		                                {1,0,0,1,1,1,1},  // 3
		                                {1,1,0,0,1,1,0},  // 4
		                                {1,1,0,1,1,0,1},  // 5
		                                {1,1,1,1,1,0,1},  // 6
		                                {0,1,0,0,1,1,1},  // 7
		                                {1,1,1,1,1,1,1},  // 8
		                                {1,1,0,1,1,1,1},  // 9
		                                {0,0,0,0,0,0,0}}; // initial state

    public static void main(String[] args) {

    	final int END  = -1,
    	          INIT = 10;
              int n,prev,num;

        //input
    	Scanner sc = new Scanner(System.in);
    	while((n = sc.nextInt()) != END){
    		prev = INIT;
    		for(int i=0;i<n;i++){
    			num = sc.nextInt();
    			for(int j=0;j<7;j++){

    		    	//calculate,output
    				System.out.print(bit[prev][j] ^ bit[num][j]);
    			}
    			System.out.println();
    			prev = num;
    		}
    	}
    }
}