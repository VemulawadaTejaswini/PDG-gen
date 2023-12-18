import java.util.Scanner;
import java.util.Arrays;

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
    			dice[i].surface[j] = scan.nextInt();
    		}
    	}

    	for(int n = 0; n < dice_num - 1; n++){
    		for(int m = n + 1; m < dice_num; m++){
				for(int i = 0; i < 4; i++){
					for(int j = 0; j < 4; j++){
			    		for(int k = 0; k < 4; k++){
			    			dice[m].spinVertical();
			    			if(Arrays.equals(dice[0].surface, dice[1].surface)) {
			    				System.out.println("No");
			    				return;
			    			}
			        	}
			    		dice[m].spinHorizontal();
		    		}
		    		dice[m].spinVertical();
				}
    		}
		}
    	System.out.println("Yes");
     }
}

class Dice{
	int[] surface = new int[6];

	public void spinVertical (){
		int temp3 = surface[0];
		surface[0] = surface[1];
		surface[1] = surface[5];
		surface[5] = surface[4];
		surface[4] = temp3;
	}

	public void spinHorizontal(){
		int temp2 = surface[0];
		surface[0] = surface[3];
		surface[3] = surface[5];
		surface[5] = surface[2];
		surface[2] = temp2;
	}
}