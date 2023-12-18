
//import java.util.ArrayDeque;
//import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] stringArray = new String[100];// = new String[];
		 char[] c;
		 char[] charArray;
		//	c = scan.nextLine().toCharArray();
	/*		for(int i = 0;scan.length;i++){
				c[i] = scan.next().toCharArray();
			}
			*/
		//	stringArray = scan.nextLine().toCharArray();
		for (int i = 0; scan.hasNext(); i++) {
			stringArray[i] = scan.next();
	
		//	charArray[i] = scan.next().toCharArray();
		}
			//空白がー１３とかなんか数字として扱われる問題
			//ってか空白をいれずにすたっくしたい
		Stack<Integer> que = new Stack<Integer>();
		int a = 0;
		int b = 0;
		for (int i = 0; i < stringArray.length; i++) {
			if(stringArray[i] == " "){
				continue;
			}
			if (stringArray[i] == "+") {
				a = que.pop();
				b = que.pop();
				que.add(b + a);
				continue;
			}
			if (stringArray[i] == "-") {
				a = que.pop();
				b = que.pop();
				que.add(b - a);
				continue;
			}
			if (stringArray[i] == "*") {
				a = que.pop();
				b = que.pop();
				que.add(b * a);
				continue;
			}
			if (stringArray[i] == "/") {
				a = que.pop();
				b = que.pop();
				que.add(b / a);
				continue;
			}
			// 演算子以外はstackに登録する
		//	int suuzi = string[i] -'0';
			que.push(Integer.parseInt(stringArray[i]));
		}
		System.out.println(que.pop());
	}
}

