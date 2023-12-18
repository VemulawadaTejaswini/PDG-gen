import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	StringBuilder output = new StringBuilder();
	Deque<Integer> List = new ArrayDeque<Integer>();
	int n;
	String order;
	int data;
	public void input() {
		n = sc.nextInt();
		for(int i=0; i<n; i++) {
			order = sc.next();
			if( order.charAt(0) == 'i' ) { List.addFirst( sc.nextInt() ); }
			else if( order.charAt(0) == 'd' ) { List.remove( sc.nextInt() ); }
			else if( order.charAt(6) == 'F' ) { List.removeFirst(); }
			else{ List.removeLast(); }
		}
	}
	public void output() {
		output.append( List.poll() );
		for(int ans : List) { output.append(" ").append(ans); }
		System.out.println(output);
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.input();
		obj.output();
	}
}

