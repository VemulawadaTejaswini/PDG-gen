import java.util.*;

public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			String str = sc.nextLine();
			if(str.equals(".")) break;
			LinkedList<Character> s = new LinkedList<Character>();
			boolean flg = true;
			int len = str.length();
			for(int i = 0; i < len; i++){
				char now = str.charAt(i);
				if(now == '(' || now == '['){
					s.addLast(now);
				}
				else if(now == ')' || now == ']'){
					if(s.isEmpty()) {
						flg = false;
						break;
					}
					char pop = s.removeLast();
					if((pop == '(' && now == ')') || (pop == '[' && now == ']')){
						
					}
					else{
						flg = false;
						break;
					}
				}
			}
			if(! s.isEmpty()){
				flg = false;
			}
			if(flg){
				System.out.println("yes");
			}
			else{
				System.out.println("no");
			}
		}
			
		
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}