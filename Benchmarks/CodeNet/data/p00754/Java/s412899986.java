
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		while(true) {
			String str=in.nextLine();
			if(str.equals("."))break;
			System.out.println(solve(str)? "Yes":"No");
		}
	}
	
	static boolean solve(String str) {
		//System.out.println("::"+str);
		char data[]=str.toCharArray();
		Stack<Character> stk=new Stack<>();
		
		for(int i=0;i<data.length;i++) {
			if(data[i]=='(' || data[i]=='[')stk.push(data[i]);
			else if(data[i]==')') {
				if(stk.isEmpty() || stk.peek()!='(')return false;
				else stk.pop();
			}
			else if(data[i]==']') {
				if(stk.isEmpty() || stk.peek()!='[')return false;
				else stk.pop();
			}
		}
		
		if(!stk.isEmpty())return false;
		else return true;
	}

}

