

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class Main 
{
	static Scanner scan = new Scanner(System.in);
	static int cubesNum;
	static Stack<Integer>[] stacks;

	public static void main(String[] args) 
	{
		while(true)
		{
//			System.out.println("NEW");
			cubesNum = scan.nextInt();
			stacks = new Stack[cubesNum];
			
			for(int i = 0; i < cubesNum; i++)
			{
				stacks[i] = new Stack<Integer>();
				stacks[i].add(i+1);
			}
			
			while(true)
			{
				//take instructions
				int a = scan.nextInt();
				int b = scan.nextInt();
				if(a == 0 && b == 0)
				{
					PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
					
					for(Stack<Integer> s : stacks)
					{
						if(s.size() > 0) {pq.add(s.size());}
					}
					
					while(pq.size() > 0)
					{
						System.out.println(pq.poll());
					}
					System.out.println("end");
					
					break;
				}
				else
				{
					//do instruction
					Stack<Integer> stackOfA = stacks[currentStackOf(a)];
					Stack<Integer> stackOfB = null;
					if(b > 0) {stackOfB = stacks[currentStackOf(b)];}
					
					//pick?
					if(a != b)
					{
						if(b == 0) //to the floor
						{
							if(stackOfA.firstElement() == a)
							{
//								System.out.println("ALREADY ON THE FLOOR!");
							}
							else
							{
								//actually put it on the floor
								while(true)
								{
									int lastCube = stackOfA.pop();
									
									//move lastCube to a floor
									addToFloor(lastCube);
									
									if(lastCube == a) {break;}
								}
							}
						}
						else //to another
						{
							if(stackOfA != stackOfB)
							{
								while(true)
								{
									int lastCube = stackOfA.pop();
									
									//move lastCube to a floor
									if(lastCube != a)
									{
										addToFloor(lastCube);
									}
									else
									{
										stackOfB.push(a);
										break;
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	static void addToFloor(int cube)
	{
		for(int i = 0; i < cubesNum; i++)
		{
			Stack<Integer> s = stacks[i];
			
			if(s.size() == 0)
			{
				s.push(cube);
				return;
			}
		}
		
		System.out.println("No floor???");
	}
	
	static int currentStackOf(int cube)
	{
		for(int i = 0; i < cubesNum; i++)
		{
			Stack<Integer> s = stacks[i];
			
			if(s.contains(cube))
			{
				return i;
			}
		}
		
		System.out.println(cube + " is nowhere!!!");
		return -999;
	}

}

