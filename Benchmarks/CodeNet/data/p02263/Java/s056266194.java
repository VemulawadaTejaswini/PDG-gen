

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	private static int calculate(String date) {
		Deque<Integer> d1 = new ArrayDeque<>();
		//数字入栈，操作符入栈，一个操作符取出两个数组计算
		String sc = "+-*/";
		for (String s : date.split(" ")) {
			
			if (sc.indexOf(s) == -1) {
				//System.out.println(s);
				d1.push(Integer.valueOf(s));
			}
				
			else {
				Integer i2 = d1.pop();
				Integer i1 = d1.pop();
				switch(s) {
				case "+": d1.push(i1 + i2); break;
				case "-": d1.push(i1 - i2);break;
				case "*": d1.push(i1 * i2);break;
				case "/": d1.push(i1 / i2);break;
				}
				//System.out.println(d1);
		}
			
		}
		return d1.pop();
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//System.out.println(Integer.valueOf('0'));
		String date = scan.nextLine();
		System.out.println(calculate(date));
	}
}

