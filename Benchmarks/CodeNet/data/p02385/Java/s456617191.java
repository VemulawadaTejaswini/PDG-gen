import java.util.Arrays;
import java.util.Scanner;

class Dice{
	int[] dice = new int[7];
	
	void Setdice(int[] box)
	{
		dice[0] = 0;
		for(int i = 1;i< 7;i++)
		{
			dice[i] = box[i - 1];
		}
	}
	
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
		Dice diceA = new Dice();
		Dice diceB = new Dice();
		int[] box = new int[6];
		for(int i = 0;i < 6;i++)
		{
			box[i] = scan.nextInt();
		}
		diceA.Setdice(box);
		for(int i = 0;i < 6;i++)
		{
			box[i] = scan.nextInt();
		}
		diceB.Setdice(box);
		
		String str = " ";
		for(int i = 0;i <= 3;i++)
		{
			if(diceA.Getdice(1) == diceB.Getdice(2) && diceA.Getdice(1) == diceB.Getdice(2)){
			if(diceA.Getdice(3) == diceB.Getdice(1) &&diceA.Getdice(1) == diceB.Getdice(4)){
			if(diceA.Getdice(6) == diceB.Getdice(1) &&diceA.Getdice(1) == diceB.Getdice(6))
			{
				break;
			}
			}
			}
			str = "N";
			diceB.diceroll(str.toCharArray());
			for(int j = 0;j <= 3;j++)
			{
				if(diceA.Getdice(1) == diceB.Getdice(2) && diceA.Getdice(1) == diceB.Getdice(2)){
				if(diceA.Getdice(3) == diceB.Getdice(1) &&diceA.Getdice(1) == diceB.Getdice(4)){
				if(diceA.Getdice(6) == diceB.Getdice(1) &&diceA.Getdice(1) == diceB.Getdice(6))
				{
					break;
				}
				}
				}
				str = "R";
				diceB.diceroll(str.toCharArray());
			}
		}
		for(int i = 0;i <= 3;i++)
		{
			if(diceA.Getdice(1) == diceB.Getdice(2) && diceA.Getdice(1) == diceB.Getdice(2)){
			if(diceA.Getdice(3) == diceB.Getdice(1) &&diceA.Getdice(1) == diceB.Getdice(4)){
			if(diceA.Getdice(6) == diceB.Getdice(1) &&diceA.Getdice(1) == diceB.Getdice(6))
			{
				break;
			}
			}
			}
			str = "W";
			diceB.diceroll(str.toCharArray());
			for(int j = 0;j <= 3;j++)
			{
				if(diceA.Getdice(1) == diceB.Getdice(2) && diceA.Getdice(1) == diceB.Getdice(2)){
				if(diceA.Getdice(3) == diceB.Getdice(1) &&diceA.Getdice(1) == diceB.Getdice(4)){
				if(diceA.Getdice(6) == diceB.Getdice(1) &&diceA.Getdice(1) == diceB.Getdice(6))
				{
					break;
				}
				}
				}
				str = "R";
				diceB.diceroll(str.toCharArray());
			}
		}
		int[] ansA = new int[6];
		int[] ansB = new int[6];
		for(int i = 0;i < 6;i++)
		{
			ansA[i] = diceA.Getdice(i + 1);
			ansB[i] = diceB.Getdice(i + 1);
		}
		
		if(Arrays.equals(ansA,ansB))
		{
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}