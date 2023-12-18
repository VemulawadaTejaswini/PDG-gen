import java.util.Scanner;
import java.util.Arrays;
import java.util.Deque;
import java.util.ArrayDeque;


class Main{
	public static void main(String[] args)throws Exception{
		Scanner scanner = new Scanner(System.in);
		Deque<Integer> stack = new ArrayDeque<>();
		int n = Integer.parseInt(scanner.nextLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < n; i++){
			String command = scanner.next();
			if(command.equals("insert")){
				stack.offerFirst(scanner.nextInt());
			}else if(command.equals("delete")){
				stack.remove(scanner.nextInt());
			}else if(command.equals("deleteFirst")){
				stack.removeFirst();
			}else{
				stack.removeLast();
			}
			
			if(i != n-1){
				String nothing = scanner.nextLine();
			}
		}

		sb.append(String.valueOf(stack.poll()));
		for(int num: stack){
		    sb.append(" ");
		    sb.append(String.valueOf(stack.poll()));
		}
		
		System.out.println(sb);

	}
}