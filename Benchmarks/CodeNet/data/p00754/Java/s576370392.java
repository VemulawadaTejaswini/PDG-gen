import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Checker c;
		String line;
		
		while(true){
			line = sc.nextLine();
			if(line.equals(".")){
				break;
			}else if(!line.isEmpty()){
				c = new Checker(line);
				if(c.scanLine()){
					System.out.println("yes");
				}else{
					System.out.println("no");
				}
			}
		}
		
	}
}

class Checker {
	String line;
	Stack<String> stack;
	
	public Checker(String line){
		this.line = line;
		stack = new Stack<String>();
	}
	
	public boolean scanLine(){
		if(!(line.charAt(line.length()-1) == '.')){
			return false;
		}
		
		for(int i=0; i<line.length(); i++){
			if(line.charAt(i) == '('){
				stack.push("(");
			}else if(line.charAt(i) == ')'){
				if(stack.size() == 0){
					return false;
				}else if(stack.pop() != "("){
					return false;
				}
			}else if(line.charAt(i) == '['){
				stack.push("[");
			}else if(line.charAt(i) == ']'){
				if(stack.size() == 0){
					return false;
				}else if(stack.pop() != "["){
					return false;
				}
			}
		}
		
		if(stack.size() != 0){
			return false;
		}
		
		return true;
	}
}