import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNextLine()) {
				String str=sc.nextLine();
				if(str.equals(".")) break;
				String[] token=str.split(" ");
				Stack<Character>  stack=new Stack<Character>();
				boolean tf=true;
				for(String t:token) {
					for(int i=0; i<t.length(); i++) {
						if(t.charAt(i)=='(') {
							stack.push(')');
						}
						else if(t.charAt(i)=='[') {
							stack.push(']');
						}
						else if(t.charAt(i)==')') {
							if(stack.isEmpty()) {
								tf=false;
								break;
							}
							char c=stack.pop();
							if(c!=t.charAt(i)) {
								tf=false;
								break;
							}
						}
						else if(t.charAt(i)==']'){
							if(stack.isEmpty()) {
								tf=false;
								break;
							}
							char c=stack.pop();
							if(c!=t.charAt(i)) {
								tf=false;
								break;
							}
						}
						else if(t.charAt(i)=='.') {
							tf=false;
							break;
						}
					}
					if(! tf) break;
				}
				if(tf)	System.out.println("yes");
				else	System.out.println("no");
			}

		}
	}
}

