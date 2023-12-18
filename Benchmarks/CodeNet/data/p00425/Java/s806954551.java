import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		Dice dice;
		int set;
		int sum;
		ArrayList<Integer> result = new ArrayList<Integer>();

		for (;;)
		{
			set = sc.nextInt();
			if (set == 0)
				break;
			
			sum = 1;
			dice = new Dice();
			for(int i = 0; i<set; ++i)
			{
				dice.operate(sc.next());
				sum += dice.getTop();
			}
			result.add(sum);
		}
		
		for(int item : result)
			System.out.println(item);

	}

}

class Dice
{
	public int[] Array = new int[6];
	private int tmp;

	public Dice()
	{
		for (int i = 0; i < 6; ++i)
			this.Array[i] = i + 1;
	}

	public void operate(String operation)
	{
		switch (operation)
		{
			case "North":
				this.rollNorth();
				break;

			case "South":
				this.rollSouth();
				break;

			case "East":
				this.rollEast();
				break;

			case "West":
				this.rollWest();
				break;

			case "Left":
				this.rotateLeft();
				break;

			case "Right":
				this.rotateRight();
				break;
		}
	}

	public void rollWest()
	{
		this.tmp = this.Array[0];
		this.Array[0] = this.Array[2];
		this.Array[2] = this.Array[5];
		this.Array[5] = this.Array[3];
		this.Array[3] = this.tmp;
	}

	public void rollNorth()
	{
		this.tmp = this.Array[0];
		this.Array[0] = this.Array[1];
		this.Array[1] = this.Array[5];
		this.Array[5] = this.Array[4];
		this.Array[4] = this.tmp;
	}

	public void rollEast()
	{
		this.tmp = this.Array[0];
		this.Array[0] = this.Array[3];
		this.Array[3] = this.Array[5];
		this.Array[5] = this.Array[2];
		this.Array[2] = this.tmp;
	}

	public void rollSouth()
	{
		this.tmp = this.Array[0];
		this.Array[0] = this.Array[4];
		this.Array[4] = this.Array[5];
		this.Array[5] = this.Array[1];
		this.Array[1] = this.tmp;
	}

	public void rotateLeft()
	{
		this.tmp = this.Array[1];
		this.Array[1] = this.Array[3];
		this.Array[3] = this.Array[4];
		this.Array[4] = this.Array[2];
		this.Array[2] = this.tmp;
	}

	public void rotateRight()
	{
		this.tmp = this.Array[1];
		this.Array[1] = this.Array[2];
		this.Array[2] = this.Array[4];
		this.Array[4] = this.Array[3];
		this.Array[3] = this.tmp;
	}

	public int getTop()
	{
		return this.Array[0];
	}

}