

import java.util.*;

class Main {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		Stack<Integer> stack=new Stack<Integer>();
		
		String expression=input.nextLine();
		
		String[] arrays=expression.split(" ");
		
		for(int i=0;i<arrays.length;i++){
			if(Character.isDigit(arrays[i].charAt(0)))
				stack.add(Integer.parseInt(arrays[i]));
			else if(!Character.isDigit(arrays[i].charAt(0))){
				int number2=stack.pop();
				int number1=stack.pop();
				
				stack.push(add(number1,number2,arrays[i].charAt(0)));
			}
				
		}
		
		System.out.println(stack.pop());
		
		
	}
	
	public static int add(int number1,int number2,char symbol){
		int result=0;
		if(symbol=='+')
			result=number1+number2;
		else if(symbol=='-')
			result=number1-number2;
		else if(symbol=='*')
			result=number1*number2;
		else if(symbol=='/')
			result=number1/number2;
		
		
		return result;
	}

}