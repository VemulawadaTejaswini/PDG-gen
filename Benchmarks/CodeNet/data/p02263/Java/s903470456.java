
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

class Main {

	public static void main(String[] args) throws IOException {
		Stack<Integer> numberStack = new Stack<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(br.readLine());
		for(;scanner.hasNext();) {
			String str = scanner.next();
			try {
				numberStack.push(Integer.parseInt(str));
			}catch(NumberFormatException e) {
				//読み込んだ文字列が数字ではない時
				if(str.equals("+")) {
					int n = numberStack.pop() + numberStack.pop();
					numberStack.push(n);
				}else if(str.equals("-")) {
					int n = -numberStack.pop() +numberStack.pop();
					numberStack.push(n);
				}else if(str.equals("*")) {
					int n = numberStack.pop() * numberStack.pop();
					numberStack.push(n);
				}
			}
		}
		scanner.close();

		System.out.println(numberStack.pop());


	}

}

