

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) 
	{
		while(true)
		{
			int input = scan.nextInt();
			if(input != 0)
			{
				new DataSet(input);
			}
			else
			{
				break;
			}
		}
	}
	
	static class DataSet
	{
		int num;
		int iterator;
		String carryInput = "";
		
		public DataSet(int n)
		{
//			System.out.println(checkDepth("a"));
			num = n;
			iterator = 0;
			int ans = read(0,0);
			System.out.println(ans);
		}
		
		int read(int depth, int operator)
		{
//			System.out.println("new read " + depth + " operator " + operator);
			List<Integer> operands = new ArrayList<Integer>();
			//read operands and smaller sentences
			while(true)
			{
				String input = "";
//				int inputValue;
//				System.out.println("C " + carryInput);
				if(carryInput.equals(""))
				{
					if(iterator < num)
					{
						input = scan.next();
						iterator += 1;
					}
				}
				else
				{
					if(checkDepth(carryInput) == depth)
					{
//						System.out.println("USE CARRY " + carryInput + " on depth " + depth + " and op " + operator);
						input = carryInput;
						carryInput = "";
					}
				}
				
				if(checkDepth(input) == depth)
				{
					if(removeDots(input).equals("+"))
					{
						operands.add( read(checkDepth(input)+1, 1) );
					}
					else if(removeDots(input).equals("*"))
					{
						operands.add( read(checkDepth(input)+1, 2) );
					}
					else //operands
					{
						operands.add(Integer.parseInt(removeDots(input)));
					}
				}
				
				if(!carryInput.equals("") && checkDepth(carryInput) == depth && !removeDots(carryInput).equals("+") && !removeDots(carryInput).equals("*"))
				{
//					System.out.println("USE LAST CARRY " + carryInput + " on depth " + depth + " and op " + operator);
					operands.add(Integer.parseInt(removeDots(carryInput)));
					carryInput = "";
				}
				
				if(checkDepth(input) < depth || iterator >= num)
				{
					if(iterator >= num)
					{
//						System.out.println("last line reached, depth " + depth + " op " + operator);
						
						if(iterator >= num && checkDepth(input) == depth)
						{
//							System.out.println("AAA " + input);
//							operands.add(Integer.parseInt(removeDots(input)));
						}
					}
					//abis...
					if(checkDepth(input) < depth) 
					{
//						System.out.println("CARRY " + input + " cd " + depth + " i " + iterator);
						
						carryInput = input;
					}
					
					if(operator == 0)
					{
//						System.out.println("R);
						return operands.get(operands.size()-1);
					}
					
					if(operator == 1)
					{
						int ans = 0;
						for(int op : operands)
						{
							ans += op;
						}
//						System.out.println("Returning addition result " + ans + " operands " + operands);
						return ans;
					}
					
					if(operator == 2)
					{
						int ans = 1;
						for(int op : operands)
						{
							ans *= op;
						}
//						System.out.println("Returning multi. result " + ans + ", operands " + operands);
						return ans;
					}
				}
				

				
			}
			
//			return -999;
		}
		
		int checkDepth(String content)
		{
			int count = 0;
			
			if(content.equals("")) {return 0;}
			
			for(int i = 0; i < content.length(); i++)
			{
				if(content.substring(i, i+1).equals("."))
				{
					count += 1;
				}
				else
				{
					return count;
				}
			}
			
			return -1;
		}
		
		String removeDots(String content)
		{
			int d = checkDepth(content);
			return content.substring(d);
		}
	}

}

