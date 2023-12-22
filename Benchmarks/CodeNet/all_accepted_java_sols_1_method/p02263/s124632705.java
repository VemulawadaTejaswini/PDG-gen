

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine();
		String[] str = line.split(" ");
		
//		for(int i=0;i<str.length;i++)
//		{
//			System.out.println(str[i]);
//		}
		
		for(int i=0;i<str.length;i++)
		{
			if(str[i].equals("+"))
			{
				int ans = stack.pop()+stack.pop();
				stack.push(ans);
			}
			else if(str[i].equals("-"))
			{
				//不能直接减除
				int a = stack.pop();
				int b = stack.pop();
				int ans = b-a;
				//int ans = stack.pop()-stack.pop();
				stack.push(ans);
			}
			else if(str[i].equals("*"))
			{
				int ans = stack.pop()*stack.pop();
				stack.push(ans);
			}
			else
			{
				stack.push(Integer.parseInt(str[i]));
			}
		}
		System.out.println(stack.pop());
		
	}
}

