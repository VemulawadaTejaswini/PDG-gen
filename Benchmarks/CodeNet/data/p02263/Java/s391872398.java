import java.util.Scanner;
import java.util.Stack;

public class Main {
	static Scanner scan = new Scanner(System.in)
;	public static void main(String args[]){
		run();
	}
	static void run(){
		Stack num, calNum;
		num = new Stack();
		calNum = new Stack();
		int n;
		String buf;
		boolean judge;
		
		judge = true;
		
		while(judge){
			buf = scan.next();
			if(isNumber(buf)){
				num.push(Integer.parseInt(buf));
			}else{
				switch(buf){
				case "+": addition(num, calNum);
				case "-": subtraction(num, calNum);
				case "*": multiplication(num, calNum);
				}
			}
		}
	}
	
	static boolean isNumber(String num){
		try{
			Integer.parseInt(num);
			return true;
		}catch(NumberFormatException e){
			return false;
		}
	}
	
	static void addition(Stack num, Stack calNum){
		int x, y;
		x = (int)num.pop();
		y = (int)num.pop();
		calNum.push(x + y);
	}
	
	static void subtraction(Stack num, Stack calNum){
		int x, y;
		x = (int)num.pop();
		y = (int)num.pop();
		calNum.push(x - y);
	}
	
	static void multiplication(Stack num, Stack calNum){
		int x, y;
		x = (int)num.pop();
		y = (int)num.pop();
		calNum.push(x * y);
	}
}