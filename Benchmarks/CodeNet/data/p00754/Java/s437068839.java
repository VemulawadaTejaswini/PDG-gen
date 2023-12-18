import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static Stack<Character> s = new Stack<Character>();
	static String[] in;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		if(!sc.hasNext())return false;
		in = sc.nextLine().split(" ");
		if(in[0].equals('.'))return false;
		return true;
	}
	
	static void solve(){
		boolean isTrue = true;
		for(int i = 0; i < in.length; i++){
			char[] word = in[i].toCharArray();
			for(int j = 0; j < word.length; j++){
				char letter = word[j];
				if(letter == '(')s.push(letter);
				if(letter == '[')s.push(letter);
				if(letter == ')'){
					if(!s.isEmpty() && s.peek() == '('){
						s.pop();
					}else{
						isTrue = false; break;
					}
				}
				if(letter == ']'){
					if(!s.isEmpty() && s.peek() == '['){
						s.pop();
					}else{
						isTrue = false; break;
					}
				}
			}
			if(!isTrue)break;
		}
		if(isTrue){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
		s.clear();
	}

}