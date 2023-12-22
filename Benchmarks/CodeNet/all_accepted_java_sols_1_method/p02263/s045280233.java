
import java.util.Scanner;
import java.util.Stack;

public class Main {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		Stack<Integer> que = new Stack<Integer>();
		Scanner scan = new Scanner(System.in);

		String[] stringArray = new String[100];// = new String[];
		char[] c;
		char[] charArray;

		String str = scan.nextLine();
		stringArray = str.split(" ");
		int a = 0;
		int b = 0;
		for (int i = 0; i < stringArray.length; i++) {
			if(stringArray[i] == " "){
				continue;
			}else
				if (stringArray[i].equals("+")) {
					a = que.pop();
					b = que.pop();
					que.add(b + a);
					continue;
				}else
					if (stringArray[i].equals("-")) {
						a = que.pop();
						b = que.pop();
						que.add(b - a);
						continue;
					}else
						if (stringArray[i].equals("*")) {
							a = que.pop();
							b = que.pop();
							que.add(b * a);
							continue;
						}else
							if (stringArray[i].equals("/")) {
								a = que.pop();
								b = que.pop();
								que.add(b / a);
								continue;
							}else
								// 演算子以外はstackに登録する
								que.push(Integer.parseInt(stringArray[i]));
		}
		System.out.println(que.pop());
	}
}

