import java.util.*;
class Main
{
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		while(!str.equals(".")){
			if(is(str))
				System.out.println("yes");
			else
				System.out.println("no");
			str = in.nextLine();
		}
	}

	public static boolean is(String input){
		char c;
		Stack<Character> s = new Stack<Character>();
		for(int i = 0;i < input.length();i++){
			c = input.charAt(i);
			switch(c){
			case '(':
				s.push(')');
				break;
			case '[':
				s.push(']');
				break;
			case ')':
			case ']':
				if(s.empty())
					return false;
				if(s.pop() != c)
					return false;
				break;
			}
		}
		return s.empty();
	}
}