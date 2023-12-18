import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static Stack<Character> stack = new Stack<Character>();
	static String[] in;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		if(!sc.hasNext())return false;
		in = sc.nextLine().split(" ");
		if(in[0].equals("."))return false;
		return true;
	}
	
	static void solve(){
		boolean flag = true;
		for(int i = 0; i < in.length; i++){
			String str = in[i];
			for(int j = 0; j < str.length(); j++){
				char letter = str.charAt(j);
				if(letter == '(' || letter == '[')stack.push(letter);
				if(letter == ')' || letter == ']'){
					if(!stack.isEmpty()){
						char top = stack.pop();
						//System.out.println("letter = " + letter);
						//System.out.println("top = " + top);
						if( (letter == ')' && top != '(') || (letter == ']' && top != '[') ){
							flag = false;
						}
					}else{
						flag = false;
					}
				}
			}
		}
		if(flag){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}

}