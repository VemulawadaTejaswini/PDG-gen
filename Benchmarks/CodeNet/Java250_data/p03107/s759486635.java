

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String argsw[])
	{
		Scanner scan=new Scanner(System.in);
		Stack<Integer> stk=new Stack<Integer>();
		String eg=scan.next();
		long count=0;
		stk.add(eg.charAt(0)-'0');
		for(int i=1;i<eg.length();i++)
		{
			if( !stk.isEmpty() && (eg.charAt(i)-'0')!=stk.peek())
			{
				stk.pop();
				count+=2;
			}else {
				stk.add(eg.charAt(i)-'0');
			}
		}
		System.out.println(count);
	}
}
