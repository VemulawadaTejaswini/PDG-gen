import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){

		ArrayList<String> stack = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		int i=-1;
		String op;

		while(true){

			op = sc.next();

			if(op.equals("push")){
				i++;
				stack.add(i, sc.next());
			}else if(op.equals("pop")){
				System.out.println(stack.get(i));
				stack.remove(i);
				i--;
			}else if(op.equals("quit")){
				break;
			}

		}
		sc.close();
	}
}