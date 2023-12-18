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
		
		int top = diceA.Getdice(1);
		int front = diceA.Getdice(2);
		String str = "";
		int count = 0;
		while(top != diceB.Getdice(count)){count++;}
		switch(count)
		{
			case 1:
				break;
			case 2:
				str = "N";
				break;
			case 3:
				str = "W";
				break;
			case 4:
				str = "E";
				break;
			case 5:
				str = "S";
				break;
			case 6:
				str = "SS";
				break;
			default:
				break;
		}
		diceB.diceroll(str.toCharArray());
		count = 0;
		boolean ansflg = true;
		for(int i = 0;i < 8;i++)
		{
			if(i != 7)
			{
				if(front == diceB.Getdice(i))
				{
					count = i;
					break;
				}
			}else{
				ansflg = false;
			}
		}
		
		if(ansflg == true)
		{
			switch(count)
			{
				case 2:
					break;
				case 3:
					str = "R";
					break;
				case 4:
					str = "L";
					break;
				case 5:
					str = "RR";
					break;
				default:
					System.out.println("No");
					break;
			}
			diceB.diceroll(str.toCharArray());

			for(int i = 3;i < 7;i++)
			{
				if(diceA.Getdice(i) != diceB.Getdice(i)){ansflg = false;}
			}
			if(ansflg == true)
			{
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}else{
			System.out.println("No");
		}
	}
}