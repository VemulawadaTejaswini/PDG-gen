import java.util.*;

class Main {
	public static void main(String[] args){
		Stack<String> s = new Stack<String>();
		Scanner input = new Scanner(System.in);
		
		while (true){
			String str = input.next();
			
			if (str.compareTo("quit") == 0) break;
			
			else if (str.compareTo("push") == 0){
				String arf = input.next();
				s.push(arf);
			}
			
			else if (str.compareTo("pop") == 0){
				System.out.println(s.pop());
			}
		}
	}
}