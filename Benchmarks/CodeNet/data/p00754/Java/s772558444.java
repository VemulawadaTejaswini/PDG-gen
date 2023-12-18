
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		while(true) {
			String str="";
			while(true) {
				String s=in.nextLine();
				str=str+s;
				char c[]=s.toCharArray();
				if(c[c.length-1]=='.')break;
			}
			char data[]=str.toCharArray();
			if(data[0]=='.')break;
			System.out.println(solve(data)? "yes":"no");
		}
	}
	
	static boolean solve(char[] data) {
		//System.out.println("::"+String.valueOf(data));
		//char data[]=str.toCharArray();
		Stack<Character> stk=new Stack<>();
		
		for(int i=0;i<data.length;i++) {
			if(data[i]=='(' || data[i]=='[')stk.push(data[i]);
			else if(data[i]==')') {
				if(!stk.isEmpty() && stk.peek()=='(')stk.pop();
				else return false;
			}
			else if(data[i]==']') {
				if(!stk.isEmpty() && stk.peek()=='[')stk.pop();
				else return false;
			}
		}
		
		if(!stk.isEmpty())return false;
		else return true;
	}

}

