import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			String line = sc.nextLine();
			if(line.equals(".")==true) break;
			String[] line2 = line.split("");
			Stack<String> stack = new Stack<String>();
			boolean flag=true;
			for(int i=0;i<line2.length;++i){
				if(line2[i].matches("[(\\[]")==true){
					stack.add(line2[i]);
				}
				if(line2[i].equals(")")==true){
					if(!stack.isEmpty()&&stack.peek().equals("(")==true) stack.pop();
					else flag=false;
				}
				if(line2[i].equals("]")==true){
					if(!stack.isEmpty()&&stack.peek().equals("[")==true) stack.pop();
					else flag=false;
				}
				if(flag==false) i=line2.length;
			}
			if(stack.isEmpty()&&flag==true) System.out.println("yes");
			else System.out.println("no");
		}
	}
}

