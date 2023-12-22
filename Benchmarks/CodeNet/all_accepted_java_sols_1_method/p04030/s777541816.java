import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		String s [] = S.split("");
		Stack <String> stack = new Stack <>();
		
		for (int i=0; i<S.length(); i++){
			if (s[i].equals("B")){
				if (stack.isEmpty()!=true)
					stack.pop();
			}
			
			else
				stack.push(s[i]);
				
		}
		String ans = "";
		for (int i=0; i<stack.size(); i++){
			ans+=stack.get(i);
		}
		System.out.println(ans);
		sc.close();
	}

}
