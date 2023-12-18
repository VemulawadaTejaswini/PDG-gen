import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] S = sc.next().toCharArray();

		Stack<Character> stack = new Stack<>();

		int ans = 0;
		for (char s : S){
			if (stack.size() <= 0){
				stack.add(s);
			}else if (stack.get(stack.size()-1) != s){
				stack.pop();
				ans += 2;
			}else {
				stack.add(s);
			}
		}
		System.out.println(ans);
	}
}