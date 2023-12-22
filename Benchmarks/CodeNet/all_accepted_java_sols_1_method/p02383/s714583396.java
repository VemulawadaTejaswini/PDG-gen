import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main{
	public static void main(String[] args){

		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int num;
		String str;
		String[] dice;
		char[] command;
		int[] int_dice=new int[6];
		int[] dice_for_change =new int[6];

		try{

			str=reader.readLine();
			dice=str.split(" ");//{1,2,3,4,5,6}={dice[0], dice[1], ... ,dice[5]}={???, S, E, W, N, ???}
			str=reader.readLine();
			command=str.toCharArray();
			for(int i=0;i<6;i++){
				int_dice[i]=Integer.parseInt(dice[i]);
			}



			for(int i=0;i<command.length;i++){

				switch(command[i]){

				case 'S':
			    {
			    	dice_for_change[0]=int_dice[4];
			    	dice_for_change[1]=int_dice[0];
			    	dice_for_change[2]=int_dice[2];
			    	dice_for_change[3]=int_dice[3];
			    	dice_for_change[4]=int_dice[5];
			    	dice_for_change[5]=int_dice[1];

			    	}
				break;

				case 'E':
			    {
			    	dice_for_change[0]=int_dice[3];
			    	dice_for_change[1]=int_dice[1];
			    	dice_for_change[2]=int_dice[0];
			    	dice_for_change[3]=int_dice[5];
			    	dice_for_change[4]=int_dice[4];
			    	dice_for_change[5]=int_dice[2];

			    	}
				break;

				case 'N':
			    {//??????
			    	dice_for_change[0]=int_dice[1];
			    	dice_for_change[1]=int_dice[5];
			    	dice_for_change[2]=int_dice[2];
			    	dice_for_change[3]=int_dice[3];
			    	dice_for_change[4]=int_dice[0];
			    	dice_for_change[5]=int_dice[4];
                	}
				break;

				case 'W':
			    {
			    	dice_for_change[0]=int_dice[2];
			    	dice_for_change[1]=int_dice[1];
			    	dice_for_change[2]=int_dice[5];
			    	dice_for_change[3]=int_dice[0];
			    	dice_for_change[4]=int_dice[4];
			    	dice_for_change[5]=int_dice[3];
                	}
				break;


				}//switch

				for(int k=0;k<6;k++){
			    	int_dice[k]=dice_for_change[k];

				}

			}//for
			System.out.println(int_dice[0]);


		}catch(IOException e){
			System.out.print(e);
		}
	}

}