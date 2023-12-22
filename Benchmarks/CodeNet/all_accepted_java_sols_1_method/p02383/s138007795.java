import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int[] dice_num,dice_num2;
    	dice_num = new int[10];
    	dice_num2 = new int[10];
    	int i;
    	for(i = 0; i < 6; i++){
    		dice_num[i] = scan.nextInt();
    	}
    	String dir_word = scan.next();
    	String dir_array[] = dir_word.split("");
    	for(i = 0; i < dir_word.length(); i++){
    		if(dir_array[i].equals("S")){
    			dice_num2[0] = dice_num[4];
    			dice_num2[1] = dice_num[0];
    			dice_num2[2] = dice_num[2];
    			dice_num2[3] = dice_num[3];
    			dice_num2[4] = dice_num[5];
    			dice_num2[5] = dice_num[1];
    		}
    		else if(dir_array[i].equals("W")){
    			dice_num2[0] = dice_num[2];
    			dice_num2[1] = dice_num[1];
    			dice_num2[2] = dice_num[5];
    			dice_num2[3] = dice_num[0];
    			dice_num2[4] = dice_num[4];
    			dice_num2[5] = dice_num[3];
    		}
    		else if(dir_array[i].equals("N")){
    			dice_num2[0] = dice_num[1];
    			dice_num2[1] = dice_num[5];
    			dice_num2[2] = dice_num[2];
    			dice_num2[3] = dice_num[3];
    			dice_num2[4] = dice_num[0];
    			dice_num2[5] = dice_num[4];
    		}
    		else if(dir_array[i].equals("E")){
    			dice_num2[0] = dice_num[3];
    			dice_num2[1] = dice_num[1];
    			dice_num2[2] = dice_num[0];
    			dice_num2[3] = dice_num[5];
    			dice_num2[4] = dice_num[4];
    			dice_num2[5] = dice_num[2];
    		}
    			dice_num[0] = dice_num2[0];
    			dice_num[1] = dice_num2[1];
    			dice_num[2] = dice_num2[2];
    			dice_num[3] = dice_num2[3];
    			dice_num[4] = dice_num2[4];
    			dice_num[5] = dice_num2[5];
    	}
    		System.out.println(dice_num[0]);
    	}
}
    




		

	