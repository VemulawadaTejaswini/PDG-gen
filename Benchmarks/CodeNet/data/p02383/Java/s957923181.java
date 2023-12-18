import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 Dice di = new Dice();
		 
		int[] dice = new int[6];
		 
		for(int i=0; i<6; i++) {
		 dice[i] = scan.nextInt();
		}
		
        char[] c = scan.next().toCharArray();	//stringをcharで入力
        int answer = 0;

        for(int i=0; i<c.length; i++) {
			answer = di.command(dice, c[i]);
        }
        
       	System.out.println(answer);
	}

}

class Dice{

	int command(int[] dice, char com) {
	    	int top = dice[0];	//dice[0]を覚えておく

	    	switch (com) {

	    	case 'N':
	    		dice[0] = dice[1];
	    		dice[1] = dice[5];
	    		dice[5] = dice[4];
	    		dice[4] = top;
	    		break;

	    	case 'E':
	    		dice[0] = dice[3];
	    		dice[3] = dice[5];
	    		dice[5] = dice[2];
	    		dice[2] = top;
	    		break;

	    	case 'W':
	    		dice[0] = dice[2];
	    		dice[2] = dice[5];
	    		dice[5] = dice[3];
	    		dice[3] = top;
	    		break;

	    	case 'S':
	    		dice[0] = dice[4];
	    		dice[4] = dice[5];
	    		dice[5] = dice[1];
	    		dice[1] = top;
	    		break;
	    	}
		return dice[0];
	 }
}
