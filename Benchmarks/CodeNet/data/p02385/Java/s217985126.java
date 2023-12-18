import java.util.Scanner;

class Main{
       public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	Dice dice1 = new Dice();
    	Dice dice2 = new Dice();
    	int count = 0;
    	
    	for(int i = 0; i < 6; i++){
    		dice1.S[i] = scan.nextInt();
    	}
    	for(int i = 0; i < 6; i++){
    		dice2.S[i] = scan.nextInt();
    	}
    	
    	for(int i = 0; i < 4; i++){
    		for(int j = 0; j < 4; j++){
        		for(int k = 0; k < 4; k++){
        			int temp3 = dice1.S[0];
            		dice1.S[0] = dice1.S[1];
            		dice1.S[1] = dice1.S[5];
            		dice1.S[5] = dice1.S[4];
            		dice1.S[4] = temp3;
            		if(dice1.S[0] == dice2.S[0] && dice1.S[1] == dice2.S[1] && dice1.S[2] == dice2.S[2] && dice1.S[3] == dice2.S[3] && dice1.S[4] == dice2.S[4] && dice1.S[5] == dice2.S[5]) {
            			System.out.println("Yes");
            		    return;
            		}
        		}
        		int temp2 = dice1.S[0];
        		dice1.S[0] = dice1.S[3];
        		dice1.S[3] = dice1.S[5];
        		dice1.S[5] = dice1.S[2];
        		dice1.S[2] = temp2;
    		}
    		int temp = dice1.S[0];
    		dice1.S[0] = dice1.S[1];
    		dice1.S[1] = dice1.S[5];
    		dice1.S[5] = dice1.S[4];
    		dice1.S[4] = temp;
    	}
    	System.out.println("No");
     }
}

class Dice{
	int[] S = new int[6];
}