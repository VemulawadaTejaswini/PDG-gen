import java.util.Scanner;
import java.util.Stack;

public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner(System.in);
			Stack<Integer> stack = new Stack<Integer>();
			int n = scan.nextInt();
			for(int i = 0 ;i < n;i++){
				stack.push(scan.nextInt());
			}
			while(!stack.isEmpty()){
				System.out.print(stack.pop());
				if(!stack.isEmpty())
					System.out.print(" ");
				else
					System.out.println();
			}
		}finally{
			if(scan != null)scan.close();
		}
	}
}