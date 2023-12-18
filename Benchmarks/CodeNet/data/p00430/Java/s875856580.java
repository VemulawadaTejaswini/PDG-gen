import java.util.Scanner;
import java.util.Stack;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(;;){
			int N = sc.nextInt();
			if(N==0)break;
			Stack<Integer> stack=new Stack<Integer>();
			rec(N,stack);
		}
	}
	static void rec(int n,Stack<Integer>stack){
		if(n==0){
			boolean first =true;
			for(Integer i:stack){
				if(first){
					System.out.print(i);
				} else{
					System.out.print(" "+i);
				}
				first=false;
				
			}
			System.out.println();
			return;
		}
		int init = n;
		if(stack.size()>0){
			init = stack.peek();
		}
		
		for(int i = init;i>0;i--){
			if(n-i<0)continue;
			stack.add(i);
			rec(n-i,stack);
			stack.pop();
		}
	}
}