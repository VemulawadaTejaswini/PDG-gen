import java.util.Scanner;

class Dice{
	int[] dice = new int[7];
	
	void diceroll(char[] roll)
	{
		for(int i = 0;i < roll.length;i++)
		{
			int temp =0;
			if(roll[i] == 'N'){
				temp = dice[1];
				dice[1] = dice[2];
				dice[2] = dice[6];
				dice[6] = dice[5];
				dice[5] = temp;
			}else if(roll[i] == 'E'){
				temp = dice[1];
				dice[1] = dice[4];
				dice[4] = dice[6];
				dice[6] = dice[3];
				dice[3] = temp;
			}else if(roll[i] == 'S'){
				temp = dice[1];
				dice[1] = dice[5];
				dice[5] = dice[6];
				dice[6] = dice[2];
				dice[2] = temp;
			}else if(roll[i] == 'W'){
				temp = dice[1];
				dice[1] = dice[3];
				dice[3] = dice[6];
				dice[6] = dice[4];
				dice[4] = temp;
			}else if(roll[i] == 'R'){
				temp = dice[2];
				dice[2] = dice[3];
				dice[3] = dice[5];
				dice[5] = dice[4];
				dice[4] = temp;
			}else if(roll[i] == 'L'){
				temp = dice[2];
				dice[2] = dice[4];
				dice[4] = dice[5];
				dice[5] = dice[3];
				dice[3] = temp;
			}
		}
	}
	
	int Getdice(int num)
	{
		return dice[num];
	}
}

public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Dice dice = new Dice();
		
		for(int i = 1;i < 7;i++)
		{
			dice.dice[i] = scan.nextInt();
		}
		String roll = scan.next();

		dice.diceroll(roll.toCharArray());
		System.out.println(dice.Getdice(1));
	}
}