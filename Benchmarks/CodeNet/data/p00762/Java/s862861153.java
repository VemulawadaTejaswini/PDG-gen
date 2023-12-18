
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main 
{
	static List<Die> dice = new ArrayList<Die>();
	static int topY = 0; //always the uppermost die's y. New dice spawns at this + 1.
	static int[] ans = new int[6];
	
	static class Die
	{
		int x = 0;
		int z = 0;
		int y = 0;

		int top;
		int bottom;
		int back;
		int front;
		int left;
		int right;

		public Die(int t, int f)
		{
			y = topY+1;
//			System.out.println("Starting y: " + y);
			
			top = t;
			front = f; //down = front
			
			back = 7-front;
			bottom = 7-top;
			
			/*
			if(top == 1 && front == 3) {left = 2; right = 5;}
			if(top == 2 && front == 3) {left = 6; right = 1;}
			if(top == 6 && front == 3) {left = 5; right = 2;}
			if(top == 5 && front == 3) {left = 1; right = 2;}
			*/
			
			if(top == 1 && front == 3) {left = 2;}
			if(top == 1 && front == 2) {left = 4;}
			if(top == 1 && front == 4) {left = 5;}
			if(top == 1 && front == 5) {left = 3;}
			
			if(top == 3 && front == 6) {left = 2;}
			if(top == 3 && front == 2) {left = 1;}
			if(top == 3 && front == 1) {left = 5;}
			if(top == 3 && front == 5) {left = 6;}
			
			if(top == 2 && front == 6) {left = 4;}
			if(top == 2 && front == 4) {left = 1;}
			if(top == 2 && front == 1) {left = 3;}
			if(top == 2 && front == 3) {left = 6;}
			
			if(top == 4 && front == 5) {left = 1;}
			if(top == 4 && front == 1) {left = 2;}
			if(top == 4 && front == 2) {left = 6;}
			if(top == 4 && front == 6) {left = 5;}
			
			if(top == 5 && front == 3) {left = 1;}
			if(top == 5 && front == 1) {left = 4;}
			if(top == 5 && front == 4) {left = 6;}
			if(top == 5 && front == 6) {left = 3;}
			
			if(top == 6 && front == 3) {left = 5;}
			if(top == 6 && front == 5) {left = 4;}
			if(top == 6 && front == 4) {left = 2;}
			if(top == 6 && front == 2) {left = 3;}
			
			right = 7-left;
			
/*			
			left = 1;
			while(left == top || left == bottom || left == front || left == back)
			{
				left += 1;
			}
			right = 7-left;
			*/
			
//			System.out.println("L: " + left + ", R: " + right);
			fall();
		}
		
		public void fall()
		{
			int toReduce = -1;
			while(y > 0)
			{
//				System.out.println("Falling y: " + y);
				
				//fall if it can. if not, break.
				boolean canFallLeft = true;
				boolean canFallRight = true;
				boolean canFallFront = true;
				boolean canFallBack = true;
				boolean canFallDown = true;
				
				if(left <= 3) {canFallLeft = false;}
				if(right <= 3) {canFallRight = false;}
				if(front <= 3) {canFallFront = false;}
				if(back <= 3) {canFallBack = false;}
				
				for(Die die : dice)
				{
					if(die.y == y-1) //the die is right below this one y-wise
					{
						if(die.x == x && die.z == z)
						{
							toReduce = die.top;
							canFallDown = false;
						}
						if(die.x == x-1 && die.z == z)
						{
							canFallLeft = false;
						}
						if(die.x == x+1 && die.z == z)
						{
							canFallRight = false;
						}
						if(die.x == x && die.z == z+1)
						{
							canFallFront = false;
						}
						if(die.x == x && die.z == z-1)
						{
							canFallBack = false;
						}						
					}
					if(die.y == y) //the die is on the same level
					{ //blocking falls
						if(die.x == x-1 && die.z == z)
						{
							canFallLeft = false;
						}
						if(die.x == x+1 && die.z == z)
						{
							canFallRight = false;
						}
						if(die.x == x && die.z == z+1)
						{
							canFallFront = false;
						}
						if(die.x == x && die.z == z-1)
						{
							canFallBack = false;
						}
					}
				}
				
				if(canFallDown)
				{
//					System.out.println("Fall down");
					y -= 1;
				}
				else
				{
					if(!canFallLeft && !canFallRight && !canFallFront && !canFallBack)
					{ //stop
						break;
					}
					else if(canFallLeft && (left > right || !canFallRight) && (left > front || !canFallFront) && (left > back || !canFallBack))
					{
						rollLeft();
					}
					else if(canFallRight && (right > left|| !canFallLeft) && (right > front|| !canFallFront) && (right > back|| !canFallBack))
					{
						rollRight();
					}
					else if(canFallFront && (front > left|| !canFallLeft) && (front > right|| !canFallRight) && (front > back|| !canFallBack))
					{
						rollFront();
					}
					else if(canFallBack && (back > left|| !canFallLeft) && (back > right|| !canFallRight) && (back > front|| !canFallFront))
					{
						rollBack();
					}
					else
					{
//						System.out.println("ERROR");
						break;
					}
				}
			}
			
			if(topY < y) {topY = y;} //see if it's the tallest die even after falling
			
//			System.out.println("Landed with top: " + top+ ", x: " + x + " z: " + z + " y: " + y);
			ans[top-1] += 1;
			if(y > 0)
			{
				ans[toReduce-1] -= 1;
			}
			
			dice.add(this);
		}
		
		public void rollRight()
		{
			int oldTop = top;
			int oldBot = bottom;
			int oldLeft = left;
			int oldRight = right;
			
			left = oldBot;
			top = oldLeft;
			right = oldTop;
			bottom = oldRight;
			
			x += 1;
			y -= 1;
		}
		
		public void rollLeft()
		{
			int oldTop = top;
			int oldBot = bottom;
			int oldLeft = left;
			int oldRight = right;
			
			left = oldTop;
			top = oldRight;
			right = oldBot;
			bottom = oldLeft;
			
			x -= 1;
			y -= 1;
		}
		
		public void rollBack()
		{
			int oldTop = top;
			int oldBot = bottom;
			int oldBack = back;
			int oldFront = front;
			
			back = oldTop;
			top = oldFront;
			front = oldBot;
			bottom = oldBack;
			
			z -= 1;
			y -= 1;
		}
		
		public void rollFront()
		{
			int oldTop = top;
			int oldBot = bottom;
			int oldBack = back;
			int oldFront = front;
			
			front = oldTop;
			top = oldBack;
			back = oldBot;
			bottom = oldFront;
			
			z += 1;
			y -= 1;
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
			int n = scan.nextInt();
			dice.clear();
			ans = new int[6];
			if(n == 0) {break;}
			
			for(int i = 0; i < n; i++)
			{
//				System.out.println("DICE");
				int t = scan.nextInt();
				int f = scan.nextInt();
				
				new Die(t,f);
			}
			
			for(int i = 0; i < 6; i++)
			{
				System.out.print(ans[i]);
				if(i < 5)
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}

