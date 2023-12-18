import java.util.Scanner;

class Main{
        public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	Dice[] dice;
    	
    	int dice_num = scan.nextInt();
    	dice = new Dice[dice_num];
    	
    	for(int i = 0; i < dice_num; i++){
    		dice[i] = new Dice();
    	}
    	
    	for(int i = 0; i < dice_num; i++){
    		for(int j = 0; j < 6; j++){
    			dice[i].S[j] = scan.nextInt();
    		}
    	}
    	for(int m = 1; m < dice_num; m++){
			for(int i = 0; i < 4; i++){
				for(int j = 0; j < 4; j++){
		    		for(int k = 0; k < 4; k++){
		    			int temp3 = dice[m-1].S[0];
		        		dice[m-1].S[0] = dice[m-1].S[1];
		        		dice[m-1].S[1] = dice[m-1].S[5];
		        		dice[m-1].S[5] = dice[m-1].S[4];
		        		dice[m-1].S[4] = temp3;
		        		if(dice[m-1].S[0] == dice[m].S[0] && dice[m-1].S[1] == dice[m].S[1] && dice[m-1].S[2] == dice[m].S[2] && dice[m-1].S[3] == dice[m].S[3] && dice[m-1].S[4] == dice[m].S[4] && dice[m-1].S[5] == dice[m].S[5]) {
		        			System.out.println("No");
		        		    return;
		        		}else{
		        			if(dice_num > 2){
		        				if(dice[m - 2].S[0] == dice[m].S[0] && dice[m - 2].S[1] == dice[m].S[1] && dice[m - 2].S[2] == dice[m].S[2] && dice[m - 2].S[3] == dice[m].S[3] && dice[m - 2].S[4] == dice[m].S[4] && dice[m - 2].S[5] == dice[m].S[5]) {
				        			System.out.println("No");
				        		    return;
				        		}
		        			}
		        		}
		    		}
		    		int temp2 = dice[m-1].S[0];
		    		dice[m-1].S[0] = dice[m-1].S[3];
		    		dice[m-1].S[3] = dice[m-1].S[5];
		    		dice[m-1].S[5] = dice[m-1].S[2];
		    		dice[m-1].S[2] = temp2;
				}
				int temp = dice[m-1].S[0];
				dice[m-1].S[0] = dice[m-1].S[1];
				dice[m-1].S[1] = dice[m-1].S[5];
				dice[m-1].S[5] = dice[m-1].S[4];
				dice[m-1].S[4] = temp;
			}
    	}
    	System.out.println("Yes");
     }
}


class Dice{
	int[] S = new int[6];
}