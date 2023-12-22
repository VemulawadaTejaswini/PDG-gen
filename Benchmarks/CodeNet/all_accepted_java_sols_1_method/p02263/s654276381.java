import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 Deque<Integer> stack = new ArrayDeque<Integer>();
		 int result=0;
		 while(scanner.hasNext()) {
		while (scanner.hasNextInt()) {
			stack.push(scanner.nextInt());
		}
		int num1=stack.remove();
		int num2=stack.remove();
		String operate=scanner.next();
		if(operate.equals("+")) {
			result=num2+num1;
		}else if(operate.equals("-")) {
			result=num2-num1;
		}else if(operate.equals("*")) {
			result=num2*num1;
		}
		stack.push(result);
		 }
		 System.out.println(result);
	}

}
