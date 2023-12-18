

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		new Main().start();
	}
	void start(){
		Scanner in = new Scanner(System.in);

		while(true){
			String s = in.nextLine();
			if(s.equals("."))break;
			int count = 0;
			for(int p = 0; p < 3; p++){
				for(int q = 0; q < 3; q++){
					for(int r = 0; r < 3; r++){
						n = 0;
						int value = formula(s, p, q, r);
						if(value == 2){
							count++;
						}
					}
				}
			}
			System.out.println(count);
		}
	}
	int n = 0;
	int formula(String s, int p, int q, int r){
		if(s.charAt(n) == '('){
			char operand = ' ';
			Stack<Integer> stack = new Stack<Integer>();
			while(true){
				n++;
				char next = s.charAt(n);
				if(next == ')')break;
				else if(next == '(')stack.push(formula(s, p, q, r));
				else if(next == '+' || next == '*')operand = next;
				else if(next == '-'){
					n++;
					stack.push(not(formula(s, p, q, r)));
					n--;
				}
				else {
					char c = s.charAt(n);
					if(c == '0' || c == '1' || c == '2'){
						int result = Integer.parseInt(""+s.charAt(n));
						stack.push(result);
					}else{
						if(c == 'R')stack.push(r);
						else if(c == 'Q')stack.push(q);
						else stack.push(p);
					}
				}
			}
			int a = stack.pop();
			int b = stack.pop();
			int result = 0;
			if(operand == '+')result = or(a,b);
			else result = and(a,b);
			return result;
		}else if(s.charAt(n) == '-'){
			n++;
			int a = not(formula(s, p, q, r));
			return a;
		}else{
			char c = s.charAt(n);
			if(c == '0' || c == '1' || c == '2'){
				int result = Integer.parseInt(""+s.charAt(n));
				n++;
				return result;
			}else{
				n++;
				if(c == 'R')return r;
				else if(c == 'Q')return q;
				else return p;
			}
		}
	}
	int not(int a){
		if(a == 0){
			return  2;
		}else if(a == 1){
			return  1;
		}else{
			return  0;
		}
	}
	int and(int a, int b){
		if(a == 0 || b == 0){
			return  0;
		}else if(a == 1 || b == 1){
			return  1;
		}else{
			return  2;
		}
	}
	int or(int a, int b){
		if(a == 0 && b == 0){
			return  0;
		}else if(a == 2 || b == 2){
			return  2;
		}else{
			return  1;
		}
	}

}