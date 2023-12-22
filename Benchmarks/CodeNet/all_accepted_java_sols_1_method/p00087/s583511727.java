import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		while(s.hasNext()){
			String str=s.nextLine();
			String []table=str.split(" ");
			Stack<String> stack=new Stack<String>();
			for(int i=0;i<table.length;i++){
				if(table[i].equals("+")){
					double a=Double.parseDouble(stack.pop());
					double b=Double.parseDouble(stack.pop());
					stack.push(""+(a+b));
				}
				else if(table[i].equals("-")){
					double a=Double.parseDouble(stack.pop());
					double b=Double.parseDouble(stack.pop());
					stack.push(""+(b-a));
				}
				else if(table[i].equals("*")){
					double a=Double.parseDouble(stack.pop());
					double b=Double.parseDouble(stack.pop());
					stack.push(""+(a*b));
				}
				else if(table[i].equals("/")){
					double a=Double.parseDouble(stack.pop());
					double b=Double.parseDouble(stack.pop());
					stack.push(""+(b/a));
				}else{
					stack.push(table[i]);
				}
			}
			System.out.println(stack.pop());
		}
	}
}