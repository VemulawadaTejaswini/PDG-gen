import java.util.Scanner;

public class Main{
	static int answer = 1;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		String s;
		char c;
		char[] brackets = new char[100];
		while(true){
			n = 0;
			s = sc.nextLine();
			if(s.length() == 1)
				break;
			for(int i = 0; i < s.length(); i++){
				c = s.charAt(i);
				if(c == '(' || c == ')' || c == '[' || c == ']'){
					brackets[n] = c;
					n++;
				}
			}
			balance(brackets, 0, n);
			System.out.println(answer == 1 ? "yes" : "no");
		}
	}
	static void balance(char[] brackets, int left, int right){
		if(left < right){
			int bal = 0;
			for(int i = left; i <= right; i++){
				if(brackets[i] == '(' || brackets[i] == '[')
					bal++;
				if(brackets[i] == ')' || brackets[i] == ']')
					bal--;
				if(bal < 0){
					answer = 0;
					break;
				}
				if(bal == 0){
					if((brackets[left] == '(' && brackets[i] == ')') ||
					(brackets[left] == '[' && brackets[i] == ']')){
						balance(brackets, left+1, i-1);
						balance(brackets, i+1, right);
					}else
						answer = 0;
					break;
				}	
			}
			if(bal > 0)
				answer = 0;
		}
	}
}