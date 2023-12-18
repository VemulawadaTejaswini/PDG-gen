import java.util.Scanner;
import java.util.Stack;


//4-2 スタック
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String poland = sc.nextLine();

		String[] e = poland.split(" ");
		Stack<Integer> stack = new Stack<>();

		for(int i = 0; i < e.length; i++) {
			if(e[i].equals("+")) {
				//1番目に取り出した数と2番目に取り出した数を足す
				stack.push(stack.pop() + stack.pop());
			}else if(e[i].equals("-")) {
				//2番目に取り出した数から1番目に取り出したを引く
				stack.push(-stack.pop() + stack.pop());
			}else if(e[i].equals("*")) {
				//1番目に取り出した数と2番目に取り出した数を掛ける
				stack.push(stack.pop() * stack.pop());
			}else {
				//数字の場合は、スタックに数字を突っ込む
				stack.push(Integer.parseInt(e[i]));
			}
		}

		System.out.println(stack.pop());

		sc.close();
	}
}
