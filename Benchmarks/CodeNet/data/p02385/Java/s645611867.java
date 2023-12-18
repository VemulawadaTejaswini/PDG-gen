import java.util.Scanner;

class Main{
       public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	Dice[] dice;

    	dice = new Dice[2];

    	for(int i = 0; i < 2; i++){
    		dice[i] = new Dice();
    	}

    	for(int i = 0; i < 2; i++){
    		for(int j = 0; j < 6; j++){
    			dice[i].surface[j] = scan.nextInt();
    		}
    	}

    	
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
			    for(int k = 0; k < 4; k++){
			   		dice[1].spinVertical();
					//?????¢??????????????´????????????????????????
			    		if(Arrays.equals(dice[0].surface, dice[1].surface)) {
			    			System.out.println("Yes");
			    			return;
			    		}
			        }
			    	dice[1].spinHorizontal();
		    	}
			dice[1].spinVertical();	
		}
    	System.out.println("No");
     }
}

/*
???????????????Dice
??????:?????????????????¢?????????
     ?????¢?????????????????¢?????\?????????
*/
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