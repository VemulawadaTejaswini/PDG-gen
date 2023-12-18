import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int count=0;
			int N = cin.nextInt();
			if(N==0){
				break;
			}
			Dice di = new Dice(1, 2);
			count += di.dice[0];
			for(int i = 0; i < N; i++){
				String str = cin.next();
				int dir = 0;
				if(str.equals("North")){
					dir = 3;
				}
				else if(str.equals("East")){
					dir = 2;
				}
				else if(str.equals("West")){
					dir = 4;
				}
				else if(str.equals("South")){
					dir = 1;
				}
				else if(str.equals("Right")){
					dir = 6;
				}
				else if(str.equals("Left")){
					dir =5 ;
				}
				di.dice = di.roll(dir);
				count += di.dice[0];
			}
			System.out.println(count);
		}

	}

}
class Dice {
	static int[] dice;
	static int[][] dice_table=
	{   {  0, 0, 0, 0, 0, 0, 0},
		{  0, 0, 3, 5, 2, 4, 0},
		{  0, 4, 0, 1, 6, 0, 3},
		{  0, 2, 6, 0, 0, 1, 5},
		{  0, 5, 1, 0, 0, 6, 2},
		{  0, 3, 0, 6, 1, 0, 4},
		{  0, 0, 4, 2, 5, 3, 0}
	
	};

	Dice(int x, int y){
		dice = new int[6];
		dice[0] = x;
		dice[1] = y;
		dice[2] = dice_table[x][y];
		dice[3] = 7-y;
		dice[4] = dice_table[y][x];
		dice[5] = 7-x;
	}
	static int[] turn(int dir){
		int[] b = new int[6];
		// Right
		if(dir == 5){
			b[0]=dice[0];
			b[1]=dice[4];
			b[2]=dice[1];
			b[3]=dice[2];
			b[4]=dice[3];
			b[5]=dice[5];
		}
		else{
			b[0]=dice[0];
			b[1]=dice[2];
			b[2]=dice[3];
			b[3]=dice[4];
			b[4]=dice[1];
			b[5]=dice[5];
		}
		return b;
	}
	static int[] roll(int dir){
		int[] b = new int[6];
		if(dir==1){
			b[0]=dice[3];
			b[1]=dice[0];
			b[2]=dice[2];
			b[3]=dice[5];
			b[4]=dice[4];
			b[5]=dice[1];
		}
		else if(dir==2){
			b[0]=dice[4];
			b[1]=dice[1];
			b[2]=dice[0];
			b[3]=dice[3];
			b[4]=dice[5];
			b[5]=dice[2];
		}
		else if(dir==3){
			b[0]=dice[1];
			b[1]=dice[5];
			b[2]=dice[2];
			b[3]=dice[0];
			b[4]=dice[4];
			b[5]=dice[3];
		}
		else if(dir==4){
			b[0]=dice[2];
			b[1]=dice[1];
			b[2]=dice[5];
			b[3]=dice[3];
			b[4]=dice[0];
			b[5]=dice[4];
		}
		else if(dir == 5){
			b[0]=dice[0];
			b[1]=dice[4];
			b[2]=dice[1];
			b[3]=dice[2];
			b[4]=dice[3];
			b[5]=dice[5];
		}
		else{
			b[0]=dice[0];
			b[1]=dice[2];
			b[2]=dice[3];
			b[3]=dice[4];
			b[4]=dice[1];
			b[5]=dice[5];
		}
		return b;
		
	}
}