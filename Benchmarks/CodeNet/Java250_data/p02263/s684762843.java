import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] s = line.split(" ");

		Deque<Integer> stack = new ArrayDeque<>();
		for(String op : s){
			if(isNumber(op)){
				stack.addLast(Integer.parseInt(op));
			}else{
				int b = stack.removeLast();
				int a = stack.removeLast();
				int c = 0;
				if(op.equals("+")){
					c = a + b;
				}else if(op.equals("-")){
					c = a - b;
				}else if(op.equals("*")){
					c = a * b;
				}
				stack.addLast(c);
			}	
		}
		System.out.println(stack.removeLast());
	}
	public static boolean isNumber(String num) {
    try {
        Integer.parseInt(num);
        return true;
        } catch (NumberFormatException e) {
        return false;
    }
}
}