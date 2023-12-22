import java.util.Scanner;
import java.util.Arrays;
import java.util.Deque;
import java.util.ArrayDeque;

class Main{
	public static void main(String[] args)throws Exception{
		Scanner scanner = new Scanner(System.in);
		Deque<Integer> stack = new ArrayDeque<>();
		String[] line = scanner.nextLine().split(" ");
		int a,b;

		for(int i = 0; i < line.length; i++){
			switch(line[i]){
				case "+":
					a = stack.pollLast();
					b = stack.pollLast();
					stack.offer(b + a);
					break;

				case "-":
					a = stack.pollLast();
					b = stack.pollLast();
					stack.offer(b - a);
					break;

				case "*":
					a = stack.pollLast();
					b = stack.pollLast();
					stack.offer(b * a);
					break;

				default :
					stack.offer(Integer.parseInt(line[i]));
					break;
			}
		}

		System.out.println(stack.poll());
	}
}