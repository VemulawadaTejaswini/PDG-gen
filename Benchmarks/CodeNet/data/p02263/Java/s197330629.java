import java.util.*;

public class Main {	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		ArrayDeque<Integer> s = new ArrayDeque<>();
		
		while(sc.hasNext()){
			String str = sc.next();
			
			switch(str){
			case "+":
				s.push(s.pop() + s.pop());
				break;
			case "-":
				s.push(-1 * s.pop() + s.pop());
				break;
			case "*":
				s.push(s.pop() * s.pop());
				break;
			default:
				s.push(Integer.parseInt(str));
			}
		}
		
		System.out.println(s.pop());
	}
	
}

