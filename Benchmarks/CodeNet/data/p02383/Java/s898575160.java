import java.util.Scanner;

class Dice{
	int[] box = new int[7];
	
	void Setdice(int[] dice)
	{
		for(int i = 1;i< 7;i++)
		{
			box[i] = dice[i - 1];
		}
	}
	
	void diceroll(char[] roll)
	{
		for(int i = 0;i < roll.length;i++)
		{
			int[] temp = new int[7];
			if(roll[i] == 'N'){
				temp[1] = box[1];
				temp[2] = box[2];
				temp[5] = box[5];
				temp[6] = box[6];
				box[1] = temp[2];
				box[2] = temp[6];
				box[5] = temp[1];
				box[6] = temp[5];
			}else if(roll[i] == 'E'){
				temp[1] = box[1];
				temp[3] = box[3];
				temp[4] = box[4];
				temp[6] = box[6];
				box[1] = temp[4];
				box[3] = temp[1];
				box[4] = temp[6];
				box[6] = temp[3];
			}else if(roll[i] == 'S'){
				temp[1] = box[1];
				temp[2] = box[2];
				temp[5] = box[5];
				temp[6] = box[6];
				box[1] = temp[5];
				box[2] = temp[1];
				box[5] = temp[6];
				box[6] = temp[2];
			}else if(roll[i] == 'W'){
				temp[1] = box[1];
				temp[3] = box[3];
				temp[4] = box[4];
				temp[6] = box[6];
				box[1] = temp[3];
				box[3] = temp[6];
				box[4] = temp[1];
				box[6] = temp[4];
			}
			for(int j = 1;j < 7;j++)
			{
				System.out.print(box[j] + " ");
			}
			System.out.println();
		}
	}
	
	int Getans(int num)
	{
		return box[num];
	}
}

public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int[] box = new int[6];
		Dice dice = new Dice();
		
		for(int i = 0;i < 6;i++)
		{
			box[i] = scan.nextInt();
		}
		
		String roll = scan.next();
		
		dice.Setdice(box);
		dice.diceroll(roll.toCharArray());
		System.out.println(dice.Getans(1));
	}
}