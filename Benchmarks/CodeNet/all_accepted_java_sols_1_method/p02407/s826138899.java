import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		Deque<Integer> stack = new LinkedList<Integer>();
		for (int i=0; i<n; i++) {
			stack.add(stdIn.nextInt());
		}
		while(stack.size()>1){
			System.out.print(stack.pollLast()+" ");
		}
		System.out.println(stack.pollLast());
	}
}