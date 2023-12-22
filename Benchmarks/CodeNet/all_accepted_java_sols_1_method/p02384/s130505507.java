import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] dice = new int[6];
        for(int i=0; i<6; i++) {
        	 dice[i] = scan.nextInt();		//６面
        }
        
        int num = scan.nextInt();
        for(int i=0; i<num; i++) {
        	
        	int up = scan.nextInt();
        	int front = scan.nextInt();
        	
        	if((up==dice[1]&&front==dice[2])||(up==dice[3]&&front==dice[1])||(up==dice[4]&&front==dice[3])||(up==dice[2]&&front==dice[4])) {
    			System.out.println(dice[0]);
    			
        	}else if((up==dice[0]&&front==dice[3])||(up==dice[2]&&front==dice[0])||(up==dice[5]&&front==dice[2])||(up==dice[3]&&front==dice[5])) {
        			System.out.println(dice[1]);
        			
        	}else if((up==dice[0]&&front==dice[1])||(up==dice[4]&&front==dice[0])||(up==dice[5]&&front==dice[4])||(up==dice[1]&&front==dice[5])) {
            			System.out.println(dice[2]);
            			
        	}else if((up==dice[0]&&front==dice[4])||(up==dice[1]&&front==dice[0])||(up==dice[5]&&front==dice[1])||(up==dice[4]&&front==dice[5])) {
    			System.out.println(dice[3]);
    			
        	}else if((up==dice[0]&&front==dice[2])||(up==dice[3]&&front==dice[0])||(up==dice[5]&&front==dice[3])||(up==dice[2]&&front==dice[5])) {
    			System.out.println(dice[4]);
    			
        	}else 
    			System.out.println(dice[5]);
        }


	}
}
