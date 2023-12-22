//stackとqueueのちがい
//char ''
//for --
//調べながら20分

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		Stack stack = new Stack();

		for(int i=0;i<s.length();i++) {

			char c = s.charAt(i);

			if(c == '0') {

				stack.push(0);

			}else if(c == '1') {

				stack.push(1);

			}else if(!stack.isEmpty()) {

				stack.pop();

			}
		}

		int size = stack.size();

		String str = "";

		for(int i=0;i<size;i++) {

			str += stack.pop();

		}

		for(int i=size-1;i>=0;i--) {

			System.out.print(str.charAt(i));
		}
	}

}
