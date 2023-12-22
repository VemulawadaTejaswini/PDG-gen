import java.util.*;
import java.io.*;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		operateStack ost = new operateStack();
		String[] str;
		int len, top = 0;
		long op, cal;
		
		str = br.readLine().split(" ", 0);
		len = str.length;
		
		for(int i = 0; i < len; i++){
			
			if(str[i].equals("+")){
				ost.calc(1);
			}
			else if(str[i].equals("-")){
				ost.calc(2);
			}
			else if(str[i].equals("*")){
				ost.calc(3);
			}
			else{
				op = Long.parseLong(str[i]);
				ost.push(op);
			}
		}
		
		System.out.println(ost.pop());
	}
}

class operateStack{
	long[] stack = new long[100];
	int top;
	
	operateStack(){
		for(int i = 0; i < 100; i++){
			stack[i] = 0;
		}
		top = 0;
	}
	
	void push(long op){
		if(top == 0 && stack[top] == 0){
			stack[top] = op;
		}
		else{
			top ++;
			stack[top] = op;
		}
	}
	
	long pop(){
		long op = stack[top];
		stack[top] = 0;
		
		if(top > 0){
			top --;
		}
		return op;
	}
	
	void calc(int flag){
		long op, op2;
		long cal;
		
		op = pop();
		op2 = pop();
		
		switch(flag){
		case 1:
			cal = op2 + op;
			break;
		case 2:
			cal = op2 - op;
			break;
		default:
			cal = op2 * op;
			break;
		}
		
		push(cal);
	}
}